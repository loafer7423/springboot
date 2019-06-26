package com.loafer.mapper;

import com.loafer.model.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 映射SQL语句的接口，无逻辑实现
 */
public interface StudentMapper {

    // 注解 @TargetDataSource 不可以在这里使用
    @Select({"select * from student where sid=#{id}"})
    Student getById(int id);
    @Select({"select * from student"})
    List<Student> getStudentList();
}
