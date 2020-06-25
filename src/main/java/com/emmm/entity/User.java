package com.emmm.entity;

import java.util.Date;

public class User{
    private String name;
    private int age;
    private int id;
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void initUserMethod(){
        System.out.println("user初始化了");
    }

    public void destroyedUserMethod(){
        System.out.println("user被摧毁了");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", date=" + date +
                '}';
    }
}
