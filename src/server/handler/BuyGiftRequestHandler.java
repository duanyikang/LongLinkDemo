package server.handler;

import client.bean.GiftBean;
import client.bean.LongMessageBean;
import com.alibaba.fastjson.JSON;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import protocol.request.BuyGiftRequestPecket;
import protocol.response.BuyGiftResponsePecket;


public class BuyGiftRequestHandler extends SimpleChannelInboundHandler<BuyGiftRequestPecket> {

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, BuyGiftRequestPecket buyGiftRequestPecket) throws Exception {
        GiftBean mGiftBean=null;

        if(buyGiftRequestPecket.getJson().getmCommandType()==1){
            mGiftBean=JSON.parseObject(buyGiftRequestPecket.getJson().getmData().toString(),GiftBean.class);
            System.out.println("我收到的购买礼物数据：："+mGiftBean.getmGiftName());
        }
        LongMessageBean messageBean=new LongMessageBean();
        messageBean.setmCommandType(1);
        messageBean.setmData(mGiftBean);


        BuyGiftResponsePecket buyGiftResponsePecket=new BuyGiftResponsePecket();
        buyGiftRequestPecket.setJson(messageBean);
        channelHandlerContext.channel().writeAndFlush(buyGiftResponsePecket);

    }
}
