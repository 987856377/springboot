package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

/**
 * Created by daier on 2018/1/11.
 */
public interface UserService {
    public void addUser(User user);
    public void updateUser(User user);
    public void deleteUser(int id);
    public List<User> getAllUser();
}
