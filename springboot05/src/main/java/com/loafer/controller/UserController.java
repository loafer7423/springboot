package com.loafer.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.loafer.entity.User;
import com.loafer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/get")
    public List<User> getUser(){
        return userService.getUser();
    }

    @GetMapping("/page")
    public PageInfo<User> page(@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "10") int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        PageInfo<User> pageInfo = new PageInfo<>(userService.findAll());
        return pageInfo;
    }

    @GetMapping("/list")
    public List<User> list(@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "10") int pageSize) {
        //pageNo和pageSize两个参数是为了接收前台传过来的值，并且通过defaultValue为这两个参数提供了默认值。
        //分页主要代码：PageHelper.startPage(pageNo,pageSize);
        //需要注意的是，分页代码PageHelper.startPage(pageNo,pageSize);只对其后的第一个查询有效。
        // 如把代码改为下面这样，添加一个查询，则第二个查询并没有分页
        PageHelper.startPage(pageNo,pageSize);
        userService.findAll();//这个查询会分页
        return userService.findAll();//这个查询不会分页
    }


}
