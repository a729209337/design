package com.lx.pojo;

public class Branch {

    private int id;
    private String branchName;
    private String branchPicture;
    private String branchDetail;
    private String name;
    private String photo;
    private String detail;
    private int sid;

    public Branch() {
    }

    public Branch(int id, String branchName, String branchPicture, String branchDetail, String name, String photo, String detail, int sid) {
        this.id = id;
        this.branchName = branchName;
        this.branchPicture = branchPicture;
        this.branchDetail = branchDetail;
        this.name = name;
        this.photo = photo;
        this.detail = detail;
        this.sid = sid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getBranchDetail() {
        return branchDetail;
    }

    public void setBranchDetail(String branchDetail) {
        this.branchDetail = branchDetail;
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

    public String getBranchPicture() {
        return branchPicture;
    }

    public void setBranchPicture(String branchPicture) {
        this.branchPicture = branchPicture;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "id=" + id +
                ", branchName='" + branchName + '\'' +
                ", branchPicture='" + branchPicture + '\'' +
                ", branchDetail='" + branchDetail + '\'' +
                ", name='" + name + '\'' +
                ", photo='" + photo + '\'' +
                ", detail='" + detail + '\'' +
                ", sid=" + sid +
                '}';
    }
}
