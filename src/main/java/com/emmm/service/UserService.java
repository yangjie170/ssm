package com.emmm.service;

import com.emmm.entity.User;

import java.util.List;

public interface UserService {

    List<User> selectAllUser();

    void saveUser(User user);
}
