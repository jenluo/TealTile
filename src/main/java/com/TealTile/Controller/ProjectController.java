package com.TealTile.Controller;

import com.TealTile.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    void handleShowProject(String projID) {}

    void handleNewMap(String projID, String dateOfCreated) {}

    void handleOpenMap(String dir){}

    void handleOpenMapByID(String projID) {}
}
