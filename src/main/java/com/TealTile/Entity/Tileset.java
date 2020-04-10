package com.TealTile.Entity;

public class Tileset {
    int height, width, spacing, tileCount, tileHeight, tileWidth;
    String imageURL;

    // constructor
    public Tileset(int height, int width, int spacing, String imageURL) {
        this.height = height;
        this.width = width;
        this.spacing = spacing;
        this.imageURL = imageURL;
        imageToTile(imageURL);
    }

    // divides image to tileset and sets the tileCount, tileHeight, and tileWidth
    void imageToTile (String imageURL) {
        int tileCount = 1, tileHeight = 1, tileWidth = 1;
        this.tileCount = tileCount;
        this.tileHeight = tileHeight;
        this.tileWidth = tileWidth;
    }

    // getter and setter methods
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

    public int getSpacing() {
        return spacing;
    }

    public void setSpacing(int spacing) {
        this.spacing = spacing;
    }

    public int getTileCount() {
        return tileCount;
    }

    public void setTileCount(int tileCount) {
        this.tileCount = tileCount;
    }

    public int getTileHeight() {
        return tileHeight;
    }

    public void setTileHeight(int tileHeight) {
        this.tileHeight = tileHeight;
    }

    public int getTileWidth() {
        return tileWidth;
    }

    public void setTileWidth(int tileWidth) {
        this.tileWidth = tileWidth;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
