package com.lx.pojo;

public class Index {
    private int id;
    private String detailOne;
    private String detailTwo;
    private String detailThree;
    private String orgUrl;
    private String deanImg;
    private String speechOne;
    private String speechTwo;
    private String speechThree;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetailOne() {
        return detailOne;
    }

    public void setDetailOne(String detailOne) {
        this.detailOne = detailOne;
    }

    public String getDetailTwo() {
        return detailTwo;
    }

    public void setDetailTwo(String detailTwo) {
        this.detailTwo = detailTwo;
    }

    public String getDetailThree() {
        return detailThree;
    }

    public void setDetailThree(String detailThree) {
        this.detailThree = detailThree;
    }

    public String getOrgUrl() {
        return orgUrl;
    }

    public void setOrgUrl(String orgUrl) {
        this.orgUrl = orgUrl;
    }

    public String getDeanImg() {
        return deanImg;
    }

    public void setDeanImg(String deanImg) {
        this.deanImg = deanImg;
    }

    public String getSpeechOne() {
        return speechOne;
    }

    public void setSpeechOne(String speechOne) {
        this.speechOne = speechOne;
    }

    public String getSpeechTwo() {
        return speechTwo;
    }

    public void setSpeechTwo(String speechTwo) {
        this.speechTwo = speechTwo;
    }

    public String getSpeechThree() {
        return speechThree;
    }

    public void setSpeechThree(String speechThree) {
        this.speechThree = speechThree;
    }

    @Override
    public String toString() {
        return "Index{" +
                "id=" + id +
                ", detailOne='" + detailOne + '\'' +
                ", detailTwo='" + detailTwo + '\'' +
                ", detailThree='" + detailThree + '\'' +
                ", orgUrl='" + orgUrl + '\'' +
                ", deanImg='" + deanImg + '\'' +
                ", speechOne='" + speechOne + '\'' +
                ", speechTwo='" + speechTwo + '\'' +
                ", speechThree='" + speechThree + '\'' +
                '}';
    }
}
