package com.TealTile.Entity;

import java.io.File;

public class Project {
    String projectID;
    String dateOfCreated;
    File projectData;

    public Project(String projectID, String dateOfCreated) {
        this.projectID = projectID;
        this.dateOfCreated = dateOfCreated;
    }

    public String getProjectID() {
        return projectID;
    }

    public String getDateOfCreated() {
        return dateOfCreated;
    }
    public void setProjectData(File projectData){
        this.projectData=projectData;
    }
    //    String
}
