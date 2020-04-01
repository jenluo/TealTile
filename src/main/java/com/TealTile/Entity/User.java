package com.TealTile.Entity;

import java.util.ArrayList;

public class User {
    private String name;
    private String pwd;
    private ArrayList<Project> profile;
    public User(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }

    public ArrayList<Project> getProfile() {
        return profile;
    }
}
