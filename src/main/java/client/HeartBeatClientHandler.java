package client;

import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;
import protocol.ProtoMessage;

import java.util.Date;

@Sharable
public class HeartBeatClientHandler extends ChannelInboundHandlerAdapter {

    
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("激活时间是："+new Date());
        System.out.println("HeartBeatClientHandler channelActive");
        ctx.fireChannelActive();
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("停止时间是："+new Date());
        System.out.println("HeartBeatClientHandler channelInactive");
    }


    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
/*        String message = (String) msg;
        System.out.println(message);
        if (message.equals("Heartbeat")) {
            ctx.write("has read message from server");
            ctx.flush();
        }*/

        System.out.println("收到"+msg.toString());
        if (msg instanceof ProtoMessage.ProtoMsg) {
            ProtoMessage.ProtoMsg packet = (ProtoMessage.ProtoMsg) msg;

            switch (packet.getType()) {
                case KEEP_ALIVE_RSP:

                    break;
                case LOGIN_RSP:

                    break;
                case SYSTEM_RSP:

                    break;
                default:
                    break;
            }
        }
        ReferenceCountUtil.release(msg);
    }
}
