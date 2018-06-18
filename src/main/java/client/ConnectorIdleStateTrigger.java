package client;

import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;
import protocol.ProtoMessage;
import protocol.head.ProtoHead;
import protocol.msg.KeepAliveMsg;

@Sharable
public class ConnectorIdleStateTrigger extends ChannelInboundHandlerAdapter {
    
/*    private static final ByteBuf HEARTBEAT_SEQUENCE = Unpooled.unreleasableBuffer(Unpooled.copiedBuffer("Heartbeat",
            CharsetUtil.UTF_8));*/

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (evt instanceof IdleStateEvent) {
            IdleState state = ((IdleStateEvent) evt).state();
            if (state == IdleState.WRITER_IDLE) {
                // write heartbeat to server
                //ctx.writeAndFlush(HEARTBEAT_SEQUENCE.duplicate());
                System.out.println("-----Send KeepAlive-----");
/*                PacketProto.Packet.Builder builder = newBuilder();
                builder.setPacketType(PacketProto.Packet.PacketType.HEARTBEAT);
                PacketProto.Packet packet = builder.build();
                ctx.writeAndFlush(packet);*/
                ProtoMessage.ProtoMsg.Builder msg = ProtoMessage.ProtoMsg.newBuilder();
                msg.setType(ProtoHead.EMsgHead.KEEP_ALIVE_REQ);
                msg.setSequence(0);
                msg.setSessionId(1);
                ProtoMessage.Request.Builder req = ProtoMessage.Request.newBuilder();
                KeepAliveMsg.KeepAliveReq.Builder keepReq = KeepAliveMsg.KeepAliveReq.newBuilder();
                keepReq.setTime(111);
                req.setKeepAliveReq(keepReq);
                msg.setRequest(req);
                ctx.writeAndFlush(msg.build());
            }
        } else {
            super.userEventTriggered(ctx, evt);
        }
    }
}
