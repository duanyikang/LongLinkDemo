package client.console;

import client.bean.GiftBean;
import client.bean.LongMessageBean;
import io.netty.channel.Channel;
import protocol.request.BuyGiftRequestPecket;

import java.util.Scanner;

public class BuyGiftConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {

        GiftBean mGiftBean = new GiftBean();
        mGiftBean.setmGiftId(1);
        mGiftBean.setmGiftName("太空漫游");
        LongMessageBean messageBean = new LongMessageBean();
        messageBean.setmCommandType(1);
        messageBean.setmData(mGiftBean);


        BuyGiftRequestPecket buyGiftRequestPecket = new BuyGiftRequestPecket();
        buyGiftRequestPecket.setJson(messageBean);
        System.out.println("我发送购买礼物的请求啦");
        channel.writeAndFlush(buyGiftRequestPecket);
    }
}
