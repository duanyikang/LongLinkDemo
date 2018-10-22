package protocol.request;


import client.bean.LongMessageBean;
import protocol.Packet;

import static protocol.command.Command.BIG_DATA_REQUEST;

/**
 * 购买礼物请求
 */
public class BuyGiftRequestPecket extends Packet {

    private LongMessageBean str;


    @Override
    public Byte getCommand() {
        return BIG_DATA_REQUEST;
    }

    public LongMessageBean getJson() {
        return str;
    }

    public void setJson(LongMessageBean json) {
        this.str = json;
    }
}
