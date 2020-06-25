package com.emmm.service.impl;

import com.emmm.entity.User;
import com.emmm.service.UserService;
import com.emmm.util.TestSuper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserServiceTest{

    @Autowired
    UserService service;

    public void ss(){

    }

    @Test
    public void testService(){
        List<User> users = service.selectAllUser();
        for (User s: users
        ) {
            System.out.println(s.toString());
        }
    }
}
