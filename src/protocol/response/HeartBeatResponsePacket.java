package protocol.response;


import protocol.Packet;

import static protocol.command.Command.HEART_RESPONSE;

public class HeartBeatResponsePacket extends Packet {
    @Override
    public Byte getCommand() {
        return HEART_RESPONSE;
    }
}
