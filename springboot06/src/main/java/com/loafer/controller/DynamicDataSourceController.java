package com.loafer.controller;

import com.loafer.model.Student;
import com.loafer.model.Teacher;
import com.loafer.model.User;
import com.loafer.service.DynamicDataSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/dds")
public class DynamicDataSourceController {

    @Autowired
    private DynamicDataSourceService service;

    /**
     * @description: 查询所有库test、test1、test2的user、student、teacher表信息
     * @author wangdong
     */
    @RequestMapping(value = "list")
    public Map<String,Object> list(){
        Map<String,Object> map = new HashMap<String,Object>();
        List<User> userList = service.getUserList();
        List<Teacher> teacherList = service.getTeacherList();
        List<Student> studentList = service.getStudentList();
        map.put("user",userList);
        map.put("teacher",teacherList);
        map.put("student",studentList);
        return map;
    }

    @RequestMapping(value = "/user/{id}")
    public User getAllUserData(@PathVariable Integer id){
        return service.getUserData(id);
    }

    @RequestMapping(value = "/teacher/{id}")
    public Teacher getAllTeacherData(@PathVariable Integer id) {
        return service.getTeacherData(id);
    }

    @RequestMapping(value = "/student/{id}")
    public Student getAllStudentData(@PathVariable Integer id) {
        return service.getStudentData(id);
    }
}
