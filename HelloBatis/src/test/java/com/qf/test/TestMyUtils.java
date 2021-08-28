package com.qf.test;

import com.qf.entity.Order;
import com.qf.entity.user;
import com.qf.mapper.OrderMapper;
import com.qf.mapper.userMapper;
import com.qf.util.MyUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TestMyUtils {
    @Test
    public void testInsert() {
        userMapper userMapper = MyUtils.getMapper(userMapper.class);
        user user = new  user();
        user.setUsername("嘿嘿嘿");
        user.setPassword("1234");
        user.setAge(18);
        userMapper.insert(user);
        MyUtils.commit();
    }
    @Test
    public void TestOrderInsert() {
        OrderMapper orderMapper = MyUtils.getMapper(OrderMapper.class);
        Order order = new Order();
        order.setName("lise");
        orderMapper.insert(order);
        MyUtils.commit();

    }

}
