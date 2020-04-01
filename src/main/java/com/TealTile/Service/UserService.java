package com.TealTile.Service;

import com.TealTile.Dao.UserDao;
import com.TealTile.Entity.Project;
import com.TealTile.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public void getUserProfile(String userName){
        userDao.getUser(userName).getProfile();
    }
    public void removeProject(String userName, Project project){
        User user=userDao.getUser(userName);
//        userDao.removeProject(user,Project);
    }

//    public void
}
