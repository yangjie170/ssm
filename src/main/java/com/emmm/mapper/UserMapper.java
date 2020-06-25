package com.emmm.mapper;

import com.emmm.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

@Mapper
public interface UserMapper {

    /*@Insert("insert into user (id,name,age) values (#{id},#{name},#{age})")*/
    int save(User user);

    /*@Select("select * from user")*/
    List<User> queryAllUser();
}
