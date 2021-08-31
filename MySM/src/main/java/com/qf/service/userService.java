package com.qf.service;

import com.qf.pojo.User;

import java.util.List;

public interface userService {
    List<User> showUser();
    int updateUser(User user);
    User show(Integer id);
    int addUser(User user);
    int removeUser(Integer id);

}
