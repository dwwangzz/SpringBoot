package com.wangzz.dao;

import com.wangzz.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author
 * @version 1.0 2016/10/11
 * @description
 */
@Mapper
public interface UserMapper {

    /**
     * 获取所有用户信息
     * @return
     */
    List<User> getAll();

    @Select("select * from user where name = #{name}")
    User findUserByName(@Param("name") String name);

    @Select("select * from user where id = #{id}")
    User findUserById(@Param("id") Long id);
}
