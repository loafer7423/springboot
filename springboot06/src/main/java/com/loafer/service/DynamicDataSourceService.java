package com.loafer.service;

import com.loafer.datasource.TargetDataSource;
import com.loafer.mapper.StudentMapper;
import com.loafer.mapper.TeacherMapper;
import com.loafer.mapper.UserMapper;
import com.loafer.model.Student;
import com.loafer.model.Teacher;
import com.loafer.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DynamicDataSourceService {
    @Resource
    private UserMapper userMapper;
    @Resource
    private TeacherMapper teacherMapper;
    @Resource
    private StudentMapper studentMapper;


    //不指定数据源使用默认数据源
    public User getUserData(Integer id) {
        return userMapper.getById(id);
    }

    //指定数据源-ds1
    @TargetDataSource(name="ds1")
    public Teacher getTeacherData(Integer id) {
        return teacherMapper.getById(id);
    }

    //指定数据源-ds2
    @TargetDataSource(name="ds2")
    public Student getStudentData(Integer id) {
        return studentMapper.getById(id);
    }
    //不指定数据源使用默认数据源
    public List<User> getUserList() {
        return userMapper.getUserList();
    }
    //指定数据源-ds1
    @TargetDataSource(name="ds1")
    public List<Teacher> getTeacherList() {
        return  teacherMapper.getTeacherList();
    }
    //指定数据源-ds2
    @TargetDataSource(name="ds2")
    public List<Student> getStudentList() {
        return studentMapper.getStudentList();
    }
}
