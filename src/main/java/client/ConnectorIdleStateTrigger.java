package client;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;
import io.netty.util.CharsetUtil;
import protocol.PacketProto;

import static protocol.PacketProto.Packet.newBuilder;

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
                PacketProto.Packet.Builder builder = newBuilder();
                builder.setPacketType(PacketProto.Packet.PacketType.HEARTBEAT);
                PacketProto.Packet packet = builder.build();
                ctx.writeAndFlush(packet);
            }
        } else {
            super.userEventTriggered(ctx, evt);
        }
    }
}
