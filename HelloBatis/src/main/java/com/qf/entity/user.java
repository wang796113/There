package com.qf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class user {
    private Integer id;
    private String username;
    private String password;
    private Integer age;
}
