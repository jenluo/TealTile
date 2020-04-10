package com.TealTile.Entity;

import java.util.ArrayList;
import java.util.List;

public class Layer {
    int id;
    int height, width;
    String type;
    boolean visible;
    ArrayList<Integer> data;
    ArrayList<Object> objectData;
    String imageURL;

    // constructor for default layer
    public Layer (int height, int width, String type) {
        this.height = height;
        this.width = width;
        this.type = "tile";
        this.visible = true;
        this.data = new ArrayList<>();
        this.objectData = null;
        this.imageURL = null;
    }

    public Layer (int height, int width, String type, ArrayList<Object> objectData) {
        this.height = height;
        this.width = width;
        this.type = "object";
        this.visible = true;
        this.data = null;
        this.objectData = objectData;
        this.imageURL = null;
    }

    public Layer (int height, int width, String type, String imageURL) {
        this.height = height;
        this.width = width;
        this.type = "image";
        this.visible = true;
        this.data = null;
        this.objectData = null;
        this.imageURL = imageURL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }


    public List<Integer> getData() {
        return data;
    }

    public void setData(ArrayList<Integer> data) {
        this.data = data;
    }

    public List<Object> getObjectData() {
        return objectData;
    }

    public void setObjectData(ArrayList<Object> objectData) {
        this.objectData = objectData;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
