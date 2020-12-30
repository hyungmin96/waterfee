package com.example.waterfee;

import android.graphics.drawable.Drawable;

public class floorData {

    private Drawable checkedIcon;
    private String floorNum;
    private String name;

    public void setIcon(Drawable icon){
        this.checkedIcon = icon;
    }

    public void setFloorNum(String num){
        this.floorNum = num;
    }

    public void setName(String name){
        this.name = name;
    }

    public Drawable getIcon(){
        return this.checkedIcon;
    }

    public String getFloorNum(){
        return this.floorNum;
    }

    public String getName(){
        return this.name;
    }
}
