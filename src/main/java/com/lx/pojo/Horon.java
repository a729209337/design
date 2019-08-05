package com.lx.pojo;

public class Horon {

    private int id;
    private String name;
    private String photo;
    private int did;

    public Horon() {
    }

    public int getId() {
        return id;
    }

    public Horon(int id, String name, String photo, int did) {
        this.id = id;
        this.name = name;
        this.photo = photo;
        this.did = did;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    @Override
    public String toString() {
        return "Horon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", photo='" + photo + '\'' +
                ", did=" + did +
                '}';
    }
}
