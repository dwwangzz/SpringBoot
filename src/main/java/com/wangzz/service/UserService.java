package com.wangzz.service;

import com.wangzz.domain.User;

import java.util.List;

/**
 * @author
 * @version 1.0 2016/10/11
 * @description
 */
public interface UserService {

    public List<User> getAll();

    User findUserByName(String name);

    User findUserById(Long id);
}
