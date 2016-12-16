package com.wangzz.controller;

import com.github.pagehelper.PageHelper;
import com.wangzz.domain.User;
import com.wangzz.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping({"/", "user"})
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @RequestMapping("/home")
    String home() {
        return "Hello World!";
    }

    @RequestMapping(value = "/users")
    public List<User> getUser() {
        //分页插件
        PageHelper.startPage(1, 10);
        List<User> all = userService.getAll();
        return all;
    }

    @RequestMapping(value = "/findUserByName")
    public User findUserByName(@RequestParam String name) {
        logger.info("根据名称查询用户！");
        User naisiman = userService.findUserByName(name);
        return naisiman;
    }

    @RequestMapping(value = "/findUserById")
    public User findUserById(@RequestParam Long id) {
        logger.info("根据id查询用户！");
        User user = userService.findUserById(id);
        return user;
    }

}