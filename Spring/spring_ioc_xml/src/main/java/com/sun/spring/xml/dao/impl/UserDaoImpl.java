package com.sun.spring.xml.dao.impl;

import com.sun.spring.xml.dao.UserDao;
import com.sun.spring.xml.service.UserService;

/**
 * @author JAB
 * @create 2023-01-26-11:55 AM
 */
public class UserDaoImpl implements UserDao {


    @Override
    public void saveUser() {
        System.out.println("保存成功！");
    }
}
