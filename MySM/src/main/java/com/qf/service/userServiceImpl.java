package com.qf.service;

import com.qf.mapper.userMapper;
import com.qf.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.beans.PersistenceDelegate;
import java.util.Comparator;
import java.util.List;

//@Service("uu1")
//@Component
@Repository
public class userServiceImpl implements userService {

    @Resource
    private userMapper userMapper;

    public List<User> showUser() {
        List<User> users = userMapper.selectUser();
        return users;
    }
    public int updateUser(User user){

        return userMapper.updateUser(user);
    }

    public User show(Integer id) {
        return userMapper.select(id);
    }

    public int addUser(User user) {
        userMapper.insertUser(user);
        return userMapper.insertUser(user);
    }

    public int removeUser(Integer id) {
        return userMapper.deleteUser(id);
    }

}
