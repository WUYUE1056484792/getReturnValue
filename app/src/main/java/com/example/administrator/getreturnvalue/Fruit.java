package com.example.administrator.getreturnvalue;

/**
 * Created by Administrator on 2017/12/13.
 */

public class Fruit {
    private String name;
    private int imageId;

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }

    public Fruit(String name, int imageId){
        this.name=name;
        this.imageId=imageId;
    }


}
