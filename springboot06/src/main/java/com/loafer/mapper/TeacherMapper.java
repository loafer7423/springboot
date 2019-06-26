package com.loafer.mapper;

import com.loafer.model.Student;
import com.loafer.model.Teacher;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 映射SQL语句的接口，无逻辑实现
 */
public interface TeacherMapper {
    
    // 注解 @TargetDataSource 不可以在这里使用
    @Select({"select * from teacher where tid=#{id}"})
    Teacher getById(int id);
    @Select({"select * from teacher"})
    List<Teacher> getTeacherList();
}
