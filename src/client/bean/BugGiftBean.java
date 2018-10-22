package client.bean;

/**
 * 购买礼物长链接
 */
public class BugGiftBean {
    private int mGiftId;
    private String mGiftName;
    private Long mPrice;

    public BugGiftBean(int mGiftId, String mGiftName, Long mPrice) {
        this.mGiftId = mGiftId;
        this.mGiftName = mGiftName;
        this.mPrice = mPrice;
    }

    public int getmGiftId() {
        return mGiftId;
    }

    public void setmGiftId(int mGiftId) {
        this.mGiftId = mGiftId;
    }

    public String getmGiftName() {
        return mGiftName;
    }

    public void setmGiftName(String mGiftName) {
        this.mGiftName = mGiftName;
    }

    public Long getmPrice() {
        return mPrice;
    }

    public void setmPrice(Long mPrice) {
        this.mPrice = mPrice;
    }
}
