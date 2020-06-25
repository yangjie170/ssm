package com.emmm.service.impl;

import com.emmm.entity.User;
import com.emmm.mapper.UserMapper;
import com.emmm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;
    @Autowired(required = false)
    public UserServiceImpl(UserMapper userMapper){
        this.userMapper = userMapper;
    }

    public List<User> selectAllUser(){

        System.out.println("service层被调用了");
        return userMapper.queryAllUser();
    }

    @Override
    public void saveUser(User user) {
        userMapper.save(user);
    }
}
