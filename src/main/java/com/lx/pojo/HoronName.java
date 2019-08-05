package com.lx.pojo;

public class HoronName {
    private int id;
    private String horonName;

    public HoronName() {
    }

    public HoronName(int id, String horonName) {
        this.id = id;
        this.horonName = horonName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoronName() {
        return horonName;
    }

    public void setHoronName(String horonName) {
        this.horonName = horonName;
    }
}
