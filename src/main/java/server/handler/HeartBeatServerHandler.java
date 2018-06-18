package server.handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;
import protocol.PacketProto;

public class HeartBeatServerHandler extends ChannelInboundHandlerAdapter {


    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        System.out.println("server channelRead..");
        System.out.println(ctx.channel().remoteAddress() + "->Server :" + msg.toString());
        // 判断接收到的包类型
        if (msg instanceof PacketProto.Packet) {
            PacketProto.Packet packet = (PacketProto.Packet) msg;

            switch (packet.getPacketType()) {
                case HEARTBEAT:
                    handleHeartbreat(ctx, packet);
                    break;

                case DATA:
                    handleData(ctx, packet);
                    break;

                default:
                    break;
            }
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
    /**
     * 处理心跳包
     *
     * @param ctx
     * @param packet
     */
    private void handleHeartbreat(ChannelHandlerContext ctx, PacketProto.Packet packet) {
        // 将心跳丢失计数器置为0
        System.out.println("收到心跳包");
        ReferenceCountUtil.release(packet);
    }
    /**
     * 处理数据包
     *
     * @param ctx
     * @param packet
     */
    private void handleData(ChannelHandlerContext ctx, PacketProto.Packet packet) {
        // 将心跳丢失计数器置为0
        String data = packet.getData();
        System.out.println(data);
        ReferenceCountUtil.release(packet);
    }
}
