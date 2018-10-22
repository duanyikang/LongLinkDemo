package protocol.response;


import client.bean.LongMessageBean;
import protocol.Packet;

import static protocol.command.Command.BIG_DATA_RESPONSE;

/**
 * 买礼物成功后
 */
public class BuyGiftResponsePecket extends Packet {
    private LongMessageBean string;

    @Override
    public Byte getCommand() {
        return BIG_DATA_RESPONSE;
    }

    public LongMessageBean getString() {
        return string;
    }

    public void setString(LongMessageBean string) {
        this.string = string;
    }
}
