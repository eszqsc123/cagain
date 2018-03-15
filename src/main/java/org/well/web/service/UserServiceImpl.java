package org.well.web.service;

import org.well.web.DAO.UserDao;
import org.well.web.DAO.UserDaoImpl;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void addUserByName(String uname) {

    }


    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
