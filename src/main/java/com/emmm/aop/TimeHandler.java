package com.emmm.aop;


import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class TimeHandler implements MethodBeforeAdvice, AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("代理前的时间"+System.currentTimeMillis() );
    }

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("代理后时间：" +System.currentTimeMillis());
    }
}
