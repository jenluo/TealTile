package com.TealTile.Controller;

import com.TealTile.Dao.ProjectDao;
import com.TealTile.Entity.Project;
import com.TealTile.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.io.File;

@Controller
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    void handleNewMap(String projectId,String dateOfCreated){
        projectService.newMap(projectId,dateOfCreated);
    }
    void handleOpenMap(String dir){
        projectService.openMap(dir);
    }

    void handleOpenProjectByID(String projectId){
        projectService.openProjectByID(projectId);
    }

}
