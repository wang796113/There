package com.qf.test;

import com.qf.pojo.Student;
import com.qf.service.StudentService;
import com.qf.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void name() {
        ApplicationContext context  = new ClassPathXmlApplicationContext("/spring-context.xml");
        StudentService studentService = (StudentService) context.getBean("studentService");
        studentService.insert(new Student());
        System.out.println("-------------------------------------------");
        studentService.queryUsers();
        System.out.println("-------------------------------------------");
        studentService.update(new Student());
    }
}
