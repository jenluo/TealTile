package com.TealTile.Entity;

import java.util.ArrayList;

public class Discussion {
    String discussionId;
    String discussionProjectID;
    ArrayList<String> chatHistory;
    ArrayList<String> users;
    ArrayList<String> times;
    Project project;
    String projectID;

    public Discussion(String discussionId, ArrayList<String> chatHistory, ArrayList<String> users, ArrayList<String> times) {
        this.discussionId = discussionId;
        this.chatHistory = chatHistory;
        this.users = users;
        this.times = times;
    }

    void updateChat(String chat, String user, String time){
        chatHistory.add(chat);
        users.add(user);
        times.add(time);
    }

    public String getDiscussionId() {
        return discussionId;
    }

    public void setDiscussionId(String discussionId) {
        this.discussionId = discussionId;
    }

    public String getDiscussionProjectID() {
        return discussionProjectID;
    }

    public void setDiscussionProjectID(String discussionProjectID) {
        this.discussionProjectID = discussionProjectID;
    }

    public ArrayList<String> getChatHistory() {
        return chatHistory;
    }

    public void setChatHistory(ArrayList<String> chatHistory) {
        this.chatHistory = chatHistory;
    }

    public ArrayList<String> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<String> users) {
        this.users = users;
    }

    public ArrayList<String> getTimes() {
        return times;
    }

    public void setTimes(ArrayList<String> times) {
        this.times = times;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }
}
