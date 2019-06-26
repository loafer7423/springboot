package com.loafer.mapper;

import com.loafer.model.Student;
import com.loafer.model.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 映射SQL语句的接口，无逻辑实现
 */
public interface UserMapper {
    
    // 注解 @TargetDataSource 不可以在这里使用
    @Select({"select * from user where id=#{id}"})
    User getById(int id);
    @Select({"select * from user"})
    List<User> getUserList();
}
