package com.loafer.mapper;


import com.loafer.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {
    @Select("SELECT * FROM user")
    @Results({
            @Result(property = "id",  column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "createTime", column = "createtime")
    })
    public List<User> getUser();

    @Select("SELECT * FROM user WHERE id = #{id}")
    @Results({
            @Result(property = "id",  column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "createTime", column = "createtime")
    })
    User getUserById(Long id);

    @Insert("INSERT INTO user(name,createTime) VALUES(#{name}, now())")
    void insert(User user);

    @Update("UPDATE user SET name=#{name} WHERE id =#{id}")
    void update(User user);

    @Delete("DELETE FROM user WHERE id =#{id}")
    void delete(Long id);
}
