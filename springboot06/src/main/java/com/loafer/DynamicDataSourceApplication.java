package com.loafer;

import com.loafer.datasource.DynamicDataSourceRegister;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;


@SpringBootApplication //启动项目的入口
@Import({DynamicDataSourceRegister.class}) // 注册动态多数据源
@MapperScan("com.loafer.mapper")//将项目中对应的mapper类的路径加进来就可以了
public class DynamicDataSourceApplication {
    public static void main(String[] args) {
        SpringApplication.run(DynamicDataSourceApplication.class, args);
    }

}
