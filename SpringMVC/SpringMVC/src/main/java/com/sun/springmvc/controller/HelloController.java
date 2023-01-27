package com.sun.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author JAB
 * @create 2023-01-27-10:40 AM
 */

@Controller
public class HelloController {

    @RequestMapping("/")
    public String protal() {
        // 将逻辑视图返回
        return "index";
    }

    @RequestMapping("/hello")
    public String hello() {

        return "success";
    }
}
