package com.loafer.controller;

import com.loafer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName UserController
 * @Description [一句话描述做什么]
 * @Author wangdong
 * @Date 2019/6/4 11:02
 * @Version V1.0
 **/
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/save")
    public void save(){
        System.out.println("开始UserController方法...");
        userService.save();
        System.out.println("结束UserController方法...");
    }
}
