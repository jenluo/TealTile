package com.TealTile.Entity;

import java.util.ArrayList;
import java.util.List;

public class Map {
    int height, width;
    int nextLayerID;
    String orientation;
    List<Layer> layerList;
    List<Tileset> tilesetList;

    public Map (int height, int width) {
        this.height = height;
        this.width = width;
        this.orientation = "orthogonal";
        this.layerList = new ArrayList<>();
        this.tilesetList = new ArrayList<>();
    }

    public Map (int height, int width, String orientation) {
        this.height = height;
        this.width = width;
        this.orientation = orientation;
        this.layerList = new ArrayList<>();
        this.tilesetList = new ArrayList<>();
    }

    public int getLayerCount() {return 0;}

    public int getTilesetCount() {return 0;}

    public void addLayer(Layer layer) {}

    public void removeLayer(Layer layer) {}

    public void addTileset(Tileset tileset) {}

    public void removeTileset(Tileset tileset) {}

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

    public int getNextLayerID() {
        return nextLayerID;
    }

    public void setNextLayerID(int nextLayerID) {
        this.nextLayerID = nextLayerID;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public List<Layer> getLayerList() {
        return layerList;
    }

    public void setLayerList(List<Layer> layerList) {
        this.layerList = layerList;
    }

    public List<Tileset> getTilesetList() {
        return tilesetList;
    }

    public void setTilesetList(List<Tileset> tilesetList) {
        this.tilesetList = tilesetList;
    }

}
