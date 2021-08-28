package com.qf.test;

import com.qf.dao.UserDao;
import com.qf.factory.BeanFactory;
import com.qf.service.UserService;

public class Test1 {
    public static void main(String[] args) throws  Exception {
        BeanFactory beanFactory = new BeanFactory("/bean.properties");

        UserDao UserDao =(UserDao) beanFactory.getBean("userDao");
        String s = UserDao.selectAll();
        System.out.println(s);

        UserService userService =(UserService) beanFactory.getBean("userService");
        String s1 = userService.ShowAll();
        System.out.println(s1);
    }



}
