package com.TealTile.Service;

import com.TealTile.Dao.UserDao;
import com.TealTile.Entity.Project;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserDao userDao;

    /**
     * Displays the user's list of projects that they are either an owner or contributor of
     *
     * @param user  the user's username
     * @param pwd   the user's password
     */
    public void getUserProject(String user, String pwd) {}

    /**
     * Adds the specified project to the user's list of projects
     *
     * @param proj  the project to be added
     */
    public void addProject(Project proj) {}

    /**
     * Removes the specified project from the user's list of projects
     *
     * @param proj  the project to be removed
     */
    public void removeProject(Project proj) {}

    /**
     * Exports the project map to a tile map file
     *
     * @param proj  the project to be exported
     */
    public void exportFile(Project proj) {}

    /**
     * Exports the project map to a JSON file
     *
     * @param proj  the project to be exported
     */
    public void exportJSON(Project proj) {}

    /**
     * Makes a project public and available to be seen by other users
     *
     * @param proj  the project to be made public
     */
    public void publishProject(Project proj) {}
}