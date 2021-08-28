package com.qf.test;

import com.qf.dao.UserDao;
import com.qf.pojo.Student;
import com.qf.pojo.User;
import com.qf.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void TestDao() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        UserDao userDao =(UserDao) applicationContext.getBean("userDao");
        String s = userDao.selectAll();
        System.out.println(s);
    }

    @Test
    public void TestService() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        UserService userService = (UserService)applicationContext.getBean("userService");
        String s = userService.ShowAll();
        System.out.println(s);
    }

    @Test
    public void Testset() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        User user = (User)applicationContext.getBean("user");
        System.out.println(user);
    }

    @Test
    public void Testconstruction() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        Student student =(Student) applicationContext.getBean("username");
        System.out.println(student);
    }
}
