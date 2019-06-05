package com.loafer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName StartApplication
 * @Description [一句话描述做什么]
 * @Author wangdong
 * @Date 2019/6/4 17:36
 * @Version V1.0
 **/
@EnableSwagger2
@SpringBootApplication
public class StartApplication {

    public static void main(String[] args){
        SpringApplication.run(StartApplication.class,args);
    }

}
