package client.handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import protocol.request.HeartBeatRequestPacket;

import java.util.concurrent.TimeUnit;

public class HeartBeatTimerHandler extends ChannelInboundHandlerAdapter {
    private static final int HEARTBEAT_INTERVAL=5;
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        ctx.executor().scheduleAtFixedRate(() -> {
            HeartBeatRequestPacket heartBeatRequestPacket=new HeartBeatRequestPacket();
            ctx.channel().writeAndFlush(heartBeatRequestPacket);
        },HEARTBEAT_INTERVAL, HEARTBEAT_INTERVAL, TimeUnit.SECONDS);
        super.channelActive(ctx);
    }
}
