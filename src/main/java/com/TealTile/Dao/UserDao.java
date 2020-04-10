package com.TealTile.Dao;

import com.TealTile.Entity.Project;
import com.TealTile.Entity.User;
import org.springframework.stereotype.Repository;


@Repository
public class UserDao {
    public User getUser(String user) {return null;}

    public void addNewUser(String user, String pwd) {}

    public void addProject(User user, Project proj) {}

    public void removeProject(User user, Project proj) {}

    public void publishProject(User user,Project proj) {}

}
