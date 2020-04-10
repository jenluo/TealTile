package com.TealTile.Entity;

import java.util.ArrayList;

public class User {
    private String name;
    private String pwd;
    private ArrayList<Project> projList;
    private ArrayList<Project> projOwnerList;

    public User(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public ArrayList<Project> getProjList() {
        return projList;
    }

    public void setProjList(ArrayList<Project> projList) {
        this.projList = projList;
    }

    public ArrayList<Project> getProjOwnerList() {
        return projOwnerList;
    }

    public void setProjOwnerList(ArrayList<Project> projOwnerList) {
        this.projOwnerList = projOwnerList;
    }
}
