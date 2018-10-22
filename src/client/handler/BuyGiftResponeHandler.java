package client.handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import protocol.response.BuyGiftResponsePecket;


/**
 * 收到长链接购买礼物的
 */
public class BuyGiftResponeHandler extends SimpleChannelInboundHandler<BuyGiftResponsePecket> {
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext,
                                BuyGiftResponsePecket bugGiftResponsePecket) throws Exception {
        System.out.println("购买礼物成功");
    }
}
