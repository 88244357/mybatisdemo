package com.xdd.dao;

import com.xdd.entity.User;

import java.util.List;

public interface UserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);
    List<User> selectAll();
    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}