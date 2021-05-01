package com.heidan.designpattern.proxypattern.dynamic03;

import com.heidan.designpattern.proxypattern.dynamic02.RealSubject;
import com.heidan.designpattern.proxypattern.dynamic02.Subject;

public class Client {
    public static void main(String[] args) {
        //定义一个主题
        Subject subject = new RealSubject();
        //定义主题的代理
        Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
        //代理的行为
        proxy.doSomething("Finish");
    }
}
