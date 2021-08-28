package com.qf.test;

import com.qf.pojo.User;
import com.qf.mapper.userMapper;
import com.qf.util.MyUtils;
import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

public class testUserMapper {
    @Test
    public void TestFindAll() {
        userMapper userMapper = MyUtils.getMapper(userMapper.class);
        List<User> list = userMapper.findUserAndDesc();
        System.out.println(list);
    }

    @Test
    public void TestFindUserAndOrder() {
        userMapper userMapper = MyUtils.getMapper(userMapper.class);
        List<User> userAndOrder = userMapper.findUserAndOrder();
        System.out.println(userAndOrder);
    }

    @Test
    public void TestFindUserAndOrderAndProduct() {
        userMapper userMapper = MyUtils.getMapper(userMapper.class);
        List<User> userAndOrderAndProduct = userMapper.findUserAndOrderAndProduct();
        System.out.println(userAndOrderAndProduct);
    }

    @Test
    public void testFindAll() {
        userMapper userMapper = MyUtils.getMapper(userMapper.class);
        List<User> userList = userMapper.findAll();
        System.out.println(userList);
    }

    @Test
    public void TestFindByNameAndSex() {
        userMapper userMapper = MyUtils.getMapper(userMapper.class);
        User user = new User();
        user.setName("青");
        List<User> userList = userMapper.findAllByNameAndSex(user);
        System.out.println(userList);
    }

    @Test
    public void TestUpdateByid() {
        userMapper userMapper = MyUtils.getMapper(userMapper.class);
        User user = new User();
        user.setId(8);
        user.setName("吴签");
        int i = userMapper.UpdateUser(user);
        MyUtils.commit();
    }

    @Test
    public void TestFindList() {
        userMapper userMapper = MyUtils.getMapper(userMapper.class);
        List<Integer> list =new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(7);
        list.add(4);
        List<User> userByIds = userMapper.findUserByIds(list);
        System.out.println(userByIds);
    }
}
