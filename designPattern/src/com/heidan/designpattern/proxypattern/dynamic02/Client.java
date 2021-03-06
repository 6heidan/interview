package com.heidan.designpattern.proxypattern.dynamic02;

import java.lang.reflect.InvocationHandler;

public class Client {
    public static void main(String[] args) {
        //定义一个主题
        Subject subject = new RealSubject();
        //定义一个Handler
        InvocationHandler handler = new MyInvocationHandler(subject);
        //定义主题的代理     c.getInterfaces()：查找到该类的所有接口，然后实现接口的所有方法
        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(), handler);
        //代理的行为
        proxy.doSomething("Finish");
    }
}
