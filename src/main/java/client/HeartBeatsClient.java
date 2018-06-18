package client;

import ch.qos.logback.core.net.SyslogOutputStream;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import io.netty.handler.timeout.IdleStateHandler;
import io.netty.util.HashedWheelTimer;
import protocol.PacketProto;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import static protocol.PacketProto.Packet.newBuilder;

public class HeartBeatsClient {
    
    protected final HashedWheelTimer timer = new HashedWheelTimer();
    
    private Bootstrap boot;
    
    private final ConnectorIdleStateTrigger idleStateTrigger = new ConnectorIdleStateTrigger();

    public void connect(int port, String host) throws Exception {
        
        EventLoopGroup group = new NioEventLoopGroup();  
        
        boot = new Bootstrap();
        boot.group(group).channel(NioSocketChannel.class).handler(new LoggingHandler(LogLevel.INFO));

        final ConnectionWatchdog watchdog = new ConnectionWatchdog(boot, timer, port,host, true) {

                public ChannelHandler[] handlers() {
                    return new ChannelHandler[] {
                            this,
                            new ProtobufVarint32FrameDecoder(),
                            new ProtobufDecoder(PacketProto.Packet.getDefaultInstance()),
                            new ProtobufVarint32LengthFieldPrepender(),
                            new ProtobufEncoder(),
                            new IdleStateHandler(0, 4, 0, TimeUnit.SECONDS),
                            idleStateTrigger,
/*                            new StringDecoder(),
                            new StringEncoder(),*/
                            new HeartBeatClientHandler()
                    };
                }
            };
            
            ChannelFuture future;
            //进行连接
            try {
                synchronized (boot) {
                    boot.handler(new ChannelInitializer<Channel>() {

                        //初始化channel
                        @Override
                        protected void initChannel(Channel ch) throws Exception {
                            ch.pipeline().addLast(watchdog.handlers());
                        }
                    });

                    future = boot.connect(host,port);
                }
                // 以下代码在synchronized同步块外面是安全的
                future.sync();
                // 模拟不定时发送向服务器发送数据的过程
                Random random = new Random();
                while (true) {
                    System.out.println("发送数据包");
                    int num = random.nextInt(10);
                    Thread.sleep(num * 1000);
                    PacketProto.Packet.Builder builder = newBuilder();
                    builder.setPacketType(PacketProto.Packet.PacketType.DATA);
                    builder.setData("我是数据包（非心跳包） " + num);
                    PacketProto.Packet packet = builder.build();
                    future.channel().writeAndFlush(packet);
                }

            } catch (Throwable t) {
                throw new Exception("connects to  fails", t);
            }
    }

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        int port = 8080;
        if (args != null && args.length > 0) {
            try {
                port = Integer.valueOf(args[0]);
            } catch (NumberFormatException e) {
                // 采用默认值
            }
        }
        new HeartBeatsClient().connect(port, "127.0.0.1");
    }

}
