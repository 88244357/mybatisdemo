package com.xdd.service;

import com.xdd.entity.User;

import java.util.List;

public interface UserService {
    public User getUserById(int userId);

    boolean addUser(User record);
    public List<User> getUsers();
}