package com.loafer.mapper;


import com.github.pagehelper.Page;
import com.loafer.entity.User;

import java.util.List;

public interface UserMapper {
    public List<User> getUser();

    Page<User> findAll();
}
