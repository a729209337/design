package com.lx.pojo;

public class Stylist {
    private int stylistId;
    private String stylistName;
    private String stylistPhoto;
    private int id;
    private String branchName;
    private String photo;

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public Stylist() {
    }

    public Stylist(int stylistId, String stylistName, String stylistPhoto) {
        this.stylistId = stylistId;
        this.stylistName = stylistName;
        this.stylistPhoto = stylistPhoto;
    }

    public int getStylistId() {
        return stylistId;
    }

    public void setStylistId(int stylistId) {
        this.stylistId = stylistId;
    }

    public String getStylistName() {
        return stylistName;
    }

    public void setStylistName(String stylistName) {
        this.stylistName = stylistName;
    }

    public String getStylistPhoto() {
        return stylistPhoto;
    }

    public void setStylistPhoto(String stylistPhoto) {
        this.stylistPhoto = stylistPhoto;
    }

    @Override
    public String toString() {
        return "Stylist{" +
                "stylistId=" + stylistId +
                ", stylistName='" + stylistName + '\'' +
                ", stylistPhoto='" + stylistPhoto + '\'' +
                '}';
    }
}
