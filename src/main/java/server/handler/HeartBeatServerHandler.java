package server.handler;

import com.google.protobuf.ByteString;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;
import org.hyperic.sigar.CpuInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import protocol.ProtoMessage;
import protocol.head.ProtoHead;
import protocol.msg.SystemMsg;
import server.HeartBeatServer;
import utils.SigarUtil;

import java.util.Properties;

public class HeartBeatServerHandler extends ChannelInboundHandlerAdapter {
    private static final Logger logger = LoggerFactory.getLogger(HeartBeatServerHandler.class);

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        //System.out.println("server channelRead..");
        //System.out.println(ctx.channel().remoteAddress() + "->Server :" + msg.toString());
        logger.info(ctx.channel().remoteAddress() + "->Server :" + msg.toString());
        // 判断接收到的包类型
        if (msg instanceof ProtoMessage.ProtoMsg) {
            ProtoMessage.ProtoMsg packet = (ProtoMessage.ProtoMsg) msg;

            switch (packet.getType()) {
                case KEEP_ALIVE_REQ:
                    handleHeartbreat(ctx, packet);
                    break;

                case LOGIN_REQ:
                    handleData(ctx, packet);
                    break;
                case SYSTEM_REQ:
                    handleSystemInfo(ctx, packet);
                    break;
                default:
                    break;
            }
        }
    }

    private void handleSystemInfo(ChannelHandlerContext ctx, ProtoMessage.ProtoMsg packet) {
        // 将心跳丢失计数器置为0
        logger.info("收到系统详情请求");
//        System.out.println("收到系统详情请求");
        ProtoMessage.ProtoMsg.Builder rsp = ProtoMessage.ProtoMsg.newBuilder();
        rsp.setType(ProtoHead.EMsgHead.SYSTEM_RSP);
        ProtoMessage.Response.Builder response = ProtoMessage.Response.newBuilder();
        SystemMsg.SystemInfoRsp.Builder sysRsp = SystemMsg.SystemInfoRsp.newBuilder();
        if(packet.getRequest().getSystemInfoReq().getGetOsInfo()){
            SystemMsg.OSInfo.Builder os = SystemMsg.OSInfo.newBuilder();
            Properties props = System.getProperties();
            os.setOsName(ByteString.copyFromUtf8(props.getProperty("os.name")));
            os.setOsArch(ByteString.copyFromUtf8(props.getProperty("os.arch")));
            os.setOsVersion(ByteString.copyFromUtf8(props.getProperty("os.version")));
            sysRsp.setOsInfo(os);
        }
        if(packet.getRequest().getSystemInfoReq().getGetCpuInfo()){

        }
        if(packet.getRequest().getSystemInfoReq().getGetDiskInfo()){

        }
        if(packet.getRequest().getSystemInfoReq().getGetJvmInfo()){
            SystemMsg.JVMInfo.Builder jvm = SystemMsg.JVMInfo.newBuilder();
            Properties props = System.getProperties();
            jvm.setJavaVersion(ByteString.copyFromUtf8(props.getProperty("java.version")));
            jvm.setJavaVmSpecificationName(ByteString.copyFromUtf8(props.getProperty("java.vm.specification.version")));
            sysRsp.setJvmInfo(jvm);
        }
        if(packet.getRequest().getSystemInfoReq().getGetMemInfo()){

        }
        if(packet.getRequest().getSystemInfoReq().getGetNetInfo()){

        }
        response.setSystemInfoRsp(sysRsp);
        rsp.setResponse(response);
        ctx.writeAndFlush(rsp.build());
        ReferenceCountUtil.release(packet);
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
    private void handleHeartbreat(ChannelHandlerContext ctx, ProtoMessage.ProtoMsg packet) {
        // 将心跳丢失计数器置为0
        //System.out.println("收到心跳包");
        logger.info("收到心跳包");
        ReferenceCountUtil.release(packet);
    }
    /**
     * 处理数据包
     *
     * @param ctx
     * @param packet
     */
    private void handleData(ChannelHandlerContext ctx, ProtoMessage.ProtoMsg packet) {
        // 将心跳丢失计数器置为0
/*        String data = packet.getData();
        System.out.println(data);*/
/*        System.out.println("收到数据包");
        System.out.println("UseName-->"+packet.getRequest().getLoginReq().getUsername().toStringUtf8());
        System.out.println("PassWord-->"+packet.getRequest().getLoginReq().getPassword().toStringUtf8());*/
        logger.info("收到数据包");
        ReferenceCountUtil.release(packet);
    }
}
