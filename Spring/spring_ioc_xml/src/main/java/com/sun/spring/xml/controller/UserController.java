package com.sun.spring.xml.controller;

import com.sun.spring.xml.service.UserService;
import com.sun.spring.xml.service.impl.UserServiceImpl;

/**
 * @author JAB
 * @create 2023-01-26-11:42 AM
 */
public class UserController {

    private UserService userService;
    /**
     * 思考：
     *  为什么不写成 private UserService userService = new UserServiceImpl();
     *  ：当前实现类需要维护时，不是在原基础上改，而是扩展一个新的实现类（硬编码内伤）
     *  ：于是把Controller交给IOC容器管理，将DAOImpl和ServiceImpl交给IOC容器管理
     */
    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void saveUser() {
        userService.saveUser();
    }
}
