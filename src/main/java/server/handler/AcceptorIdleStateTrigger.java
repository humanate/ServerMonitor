package server.handler;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;
import protocol.PacketProto;


@ChannelHandler.Sharable
public class AcceptorIdleStateTrigger extends ChannelInboundHandlerAdapter {
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        System.out.println("收到--》"+msg.toString());
        if (msg instanceof PacketProto.Packet) {
            PacketProto.Packet packet = (PacketProto.Packet) msg;

            switch (packet.getPacketType()) {
                case HEARTBEAT:
                    //handleHeartbreat(ctx, packet);
                    System.out.println("HEARTBEAT");
                    break;

                case DATA:
                    //handleData(ctx, packet);
                    System.out.println("DATA");
                    break;

                default:
                    break;
            }
        }
    }

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (evt instanceof IdleStateEvent) {
            IdleState state = ((IdleStateEvent) evt).state();
            if (state == IdleState.READER_IDLE) {
                throw new Exception("idle exception");
            }
        } else {
            super.userEventTriggered(ctx, evt);
        }
    }
}
