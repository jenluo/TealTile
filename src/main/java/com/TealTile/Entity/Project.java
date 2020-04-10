package com.TealTile.Entity;

import java.io.File;
import java.nio.file.Path;
import java.util.stream.Stream;
import java.util.ArrayList;

public class Project {
    String projID;
    String dateOfCreated;
    Map projectMap;
    File projectData;
    ArrayList<String> ownerList;
    ArrayList<String> contributorList;
    Discussion discussion;
    String discussionID;

    public Project (String projID, File projectData) {}

    public boolean isOwner(String user) {return false;}

    public boolean isContributor(String user) {return false;}

    public void addContributor(String user) {}

    public void removeContributor(String user) {}

    public String getProjID() {
        return projID;
    }

    public void setProjID(String projID) {
        this.projID = projID;
    }

    public String getDateOfCreated() {
        return dateOfCreated;
    }

    public void setDateOfCreated(String dateOfCreated) {
        this.dateOfCreated = dateOfCreated;
    }

    public Map getProjectMap() {
        return projectMap;
    }

    public void setProjectMap(Map projectMap) {
        this.projectMap = projectMap;
    }

    public File getProjectData() {
        return projectData;
    }

    public void setProjectData(File projectData) {
        this.projectData = projectData;
    }

    public ArrayList<String> getOwnerList() {
        return ownerList;
    }

    public void setOwnerList(ArrayList<String> ownerList) {
        this.ownerList = ownerList;
    }

    public ArrayList<String> getContributorList() {
        return contributorList;
    }

    public void setContributorList(ArrayList<String> contributorList) {
        this.contributorList = contributorList;
    }

    public Discussion getDiscussion() {
        return discussion;
    }

    public void setDiscussion(Discussion discussion) {
        this.discussion = discussion;
    }

    public String getDiscussionID() {
        return discussionID;
    }

    public void setDiscussionID(String discussionID) {
        this.discussionID = discussionID;
    }
}
