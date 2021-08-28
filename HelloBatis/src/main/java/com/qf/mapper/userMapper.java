package com.qf.mapper;

import com.qf.entity.user;

import java.util.List;

public interface userMapper {
    public List<user> findAll();
    public int insert(user user);
    public int delete(Integer id);
    public List<user> findAllByNameLike(String name);
}
