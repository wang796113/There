package com.qf.mapper;

import com.qf.pojo.User;

import java.util.List;

public interface userMapper {
    public List<User> findUserAndDesc();
    public List<User> findUserAndOrder();
    public List<User> findUserAndOrderAndProduct();
    public List<User> findAll();
    public List<User> findAllByNameAndSex(User user);
    public int UpdateUser(User user);
    public List<User> findUserByIds(List<Integer> integers);
}
