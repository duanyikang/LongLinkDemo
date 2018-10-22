package client.bean;

/**
 * 长链接包裹
 *
 *
 * 1：太空漫游
 * 2
 */
public class LongMessageBean<T> {
    private int mCommandType;
    private T mData;

    public int getmCommandType() {
        return mCommandType;
    }

    public void setmCommandType(int mCommandType) {
        this.mCommandType = mCommandType;
    }

    public T getmData() {
        return mData;
    }

    public void setmData(T mData) {
        this.mData = mData;
    }
}
