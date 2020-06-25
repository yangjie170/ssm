package com.emmm.test;

import com.emmm.entity.User;
import com.emmm.mapper.UserMapper;
import com.emmm.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath: applicationContext.xml")
public class test {


    @Autowired
    private UserService service;

    @Test
    public void testUserService(){
        List<User> users = service.selectAllUser();
        for (User user:users
             ) {
            System.out.println(user.toString());
        }
    }
    @Test
    public void testSave(){
        User user = new User();
        user.setAge(1);
        user.setName("123");
        service.saveUser(user);
    }

    @Test
    public void testMybatis() throws IOException {

        InputStream resourceAsStream = Resources.getResourceAsStream("sqlmapconfig.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.queryAllUser();

        for (User user: users
             ) {
            System.out.println(user.toString());
        }

        sqlSession.close();
        resourceAsStream.close();
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
