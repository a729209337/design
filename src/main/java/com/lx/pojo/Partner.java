package com.lx.pojo;

public class Partner {
    private int id;
    private String partnerImgUrl;
    private String partnerImg;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPartnerImgUrl() {
        return partnerImgUrl;
    }

    public void setPartnerImgUrl(String partnerImgUrl) {
        this.partnerImgUrl = partnerImgUrl;
    }

    public String getPartnerImg() {
        return partnerImg;
    }

    public void setPartnerImg(String partnerImg) {
        this.partnerImg = partnerImg;
    }

    @Override
    public String toString() {
        return "Partner{" +
                "id=" + id +
                ", partnerImgUrl='" + partnerImgUrl + '\'' +
                ", partnerImg='" + partnerImg + '\'' +
                '}';
    }
}
