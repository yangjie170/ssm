package com.emmm.controller;

import com.emmm.entity.User;
import com.emmm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    private UserService userService;

    @Autowired
    public  UserController(UserService userService){
        this.userService = userService;
    }

    @RequestMapping("findAll")
    public String findAll(Model model){
        System.out.println("controller被调用 ");

        List<User> users = userService.selectAllUser();
        model.addAttribute("list",users);
        /*调用service方法*/
        return "list";
    }
}
