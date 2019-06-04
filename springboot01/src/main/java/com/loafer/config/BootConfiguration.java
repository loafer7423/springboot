package com.loafer.config;

import com.loafer.service.RoleService;
import com.loafer.service.UserService;
import com.loafer.service.impl.RoleServiceImpl;
import com.loafer.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BootConfiguration {

    @Bean
    public UserService userService(){
        return new UserServiceImpl(roleService());
    }

    @Bean
    public RoleService roleService(){
        return new RoleServiceImpl();
    }

}
