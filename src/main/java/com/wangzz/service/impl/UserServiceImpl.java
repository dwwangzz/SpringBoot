package com.wangzz.service.impl;

import com.wangzz.dao.UserMapper;
import com.wangzz.domain.User;
import com.wangzz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author
 * @version 1.0 2016/10/11
 * @description
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAll() {
        List<User> all = userMapper.getAll();
        return all;
    }

    @Override
    public User findUserByName(String name) {
        return userMapper.findUserByName(name);
    }

    @Override
    public User findUserById(Long id) {
        return userMapper.findUserById(id);
    }

}
