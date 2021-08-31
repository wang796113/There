package com.qf.test;

import com.qf.pojo.User;
import com.qf.service.userService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class) //由SpringJUnit4ClassRunner启动测试
@ContextConfiguration("classpath:applicationContext.xml") //spring的配置文件位置
public class testSM {

    //@Resource(name = "uu1")
    @Autowired
    private userService userService;
    @Test
    public void testSelect() {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        userService userService = (userService)applicationContext.getBean("userService");
        List<User> users = userService.showUser();
        System.out.println(users);
    }

    @Test
    public void testUpdate() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        userService userService = (userService)applicationContext.getBean("userService");
        User user =new User();
        user.setId(7);
        user.setName("哈哈");

        System.out.println(userService.updateUser(user));

    }

    @Test
    public void testSelectOne() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        userService userService = (userService)applicationContext.getBean("userService");
        System.out.println(userService.show(5));
    }

    @Test
    public void testDelete() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        userService userService = (userService)applicationContext.getBean("userService");
        userService.removeUser(9);
    }
    @Test
    public void testInsert() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        userService userService = (userService)applicationContext.getBean("userService");
        User user = new User();
        user.setName("王..");
        user.setPassword("123");
        user.setBirthday(new Date());
        user.setRegistTime(new Date());
        user.setSex("男");
        userService.addUser(user);
    }

}
