package com.sun.spring.xml.service.impl;

import com.sun.spring.xml.dao.UserDao;
import com.sun.spring.xml.service.UserService;

/**
 * @author JAB
 * @create 2023-01-26-11:53 AM
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
