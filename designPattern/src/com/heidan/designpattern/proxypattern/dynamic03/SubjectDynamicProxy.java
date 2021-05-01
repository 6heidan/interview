package com.heidan.designpattern.proxypattern.dynamic03;

import com.heidan.designpattern.proxypattern.dynamic02.DynamicProxy;
import com.heidan.designpattern.proxypattern.dynamic02.MyInvocationHandler;
import com.heidan.designpattern.proxypattern.dynamic02.Subject;

import java.lang.reflect.InvocationHandler;

public class SubjectDynamicProxy extends DynamicProxy {
    public static <T> T newProxyInstance(Subject subject){
        //获得ClassLoader
        ClassLoader loader = subject.getClass().getClassLoader();
        //获得接口数组
        Class<?>[] classes = subject.getClass().getInterfaces();
        //获得handler
        InvocationHandler handler = new MyInvocationHandler(subject);
        return newProxyInstance(loader,classes,handler);

    }
}
