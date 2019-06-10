package com.loafer.service;


import com.github.pagehelper.Page;
import com.loafer.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUser();

    Page<User> findAll();
}
