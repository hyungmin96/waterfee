package com.example.waterfee;

public class roomData {

    private int img;


    private int img2;


    private String roomNum, day, name, waterLevel, useLevel;
    private boolean expandable;

    public roomData(int img, int img2, String roomNum, String day, String name, String waterLevel, String useLevel) {
        this.img = img;
        this.img2 = img2;

        this.roomNum = roomNum;
        this.day = day;
        this.name = name;
        this.waterLevel = waterLevel;
        this.useLevel = useLevel;
        this.expandable = false;
    }

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }

    public int getImg2() {
        return img2;
    }

    public void setImg2(int img2) {
        this.img2 = img2;
    }

    public boolean isExpandable() {
        return expandable;
    }

    public void setExpandable(boolean expandable) {
        this.expandable = expandable;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(String waterLevel) {
        this.waterLevel = waterLevel;
    }

    public String getUseLevel() {
        return useLevel;
    }

    public void setUseLevel(String useLevel) {
        this.useLevel = useLevel;
    }
}
