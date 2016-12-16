package com.wangzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//基于注解的mybatis配置：@MapperScan("com.wangzz.dao")
//@SpringBootApplication//等价于@ComponentScan+@EnableAutoConfiguration+@Configuration
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
