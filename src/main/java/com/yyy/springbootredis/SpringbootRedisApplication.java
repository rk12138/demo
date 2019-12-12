package com.yyy.springbootredis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

//@ServletComponentScan
//  Servlet通过@WebServlet注解自动注册
//  Filter通过@WebFilter注解自动注册
//  Listener通过@WebFilter注解自动注册

@SpringBootApplication
@ServletComponentScan
//@MapperScan("com.yyy.springbootredis.mapper")
public class SpringbootRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootRedisApplication.class, args);
    }

}
