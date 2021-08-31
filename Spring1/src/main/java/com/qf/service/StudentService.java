package com.qf.service;

import com.qf.pojo.Student;
import org.springframework.core.annotation.Order;

import java.util.List;

public interface StudentService {
    List<Student> queryUsers();
    int update(Student student);
    int insert(Student student);
    int delete(Integer id);
}
