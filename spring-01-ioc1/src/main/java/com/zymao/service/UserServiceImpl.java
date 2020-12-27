package com.zymao.service;

import com.zymao.dao.UserDao;
import com.zymao.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    public void getUser() {
        System.out.println(" in service getUser");
        userDao.getUser();
    }
}
