package com.qf.controller;

import com.qf.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/findUser")
    public String findUser(Model model) {
        User user = new User();
        user.setName("张三");
        user.setSex("男");
        user.setId(1);


        model.addAttribute("user", user);

        return "userList";
    }
}
