package com.loafer.service.impl;

import com.loafer.service.RoleService;
import com.loafer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName UserServiceImpl
 * @Description [一句话描述做什么]
 * @Author wangdong
 * @Date 2019/6/4 10:50
 * @Version V1.0
 **/
public class UserServiceImpl implements UserService {

    private RoleService roleService;

    public UserServiceImpl(RoleService roleService){
        this.roleService = roleService;
    }

    @Override
    public void save() {
        System.out.println("this is UserServiceImpl save mthod ...");
        roleService.saveRole();
    }
}
