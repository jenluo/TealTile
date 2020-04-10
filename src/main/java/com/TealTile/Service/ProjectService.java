package com.TealTile.Service;

import com.TealTile.Dao.ProjectDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    @Autowired
    private ProjectDao projectDao;

    /**
     * Displays the project with the specified project ID
     *
     * @param projID    project ID of the project to be shown
     */
    public void showProject(String projID) {}

    /**
     * Creates a new project with the specified id and the current date
     *
     * @param id        the project ID for this project
     * @param date      the date the project was created
     */
    public void newMap(String id, String date) {}

    /**
     * Opens a project from the user's specified path
     *
     * @param dir       the path to the project file
     */
    public void openMap(String dir) {}

    /**
     * Opena a project from the user's specified project ID
     *
     * @param projID    the project ID for the project to be opened
     */
    public void openMapByID(String projID) {}
}
