package protocol.request;


import protocol.Packet;

import static protocol.command.Command.HEART_REQUEST;

public class HeartBeatRequestPacket extends Packet {
    private long mCurrentTime;

    public HeartBeatRequestPacket() {
        this.mCurrentTime = System.currentTimeMillis();
    }

    @Override
    public Byte getCommand() {
        return HEART_REQUEST;
    }

    public long getmCurrentTime() {
        return mCurrentTime;
    }

    public void setmCurrentTime(long mCurrentTime) {
        this.mCurrentTime = mCurrentTime;
    }
}
