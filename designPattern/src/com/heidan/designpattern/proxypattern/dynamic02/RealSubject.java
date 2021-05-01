package com.heidan.designpattern.proxypattern.dynamic02;

public class RealSubject implements Subject {
    @Override
    public void doSomething(String string) {
        System.out.println("do something!===>"+string);
    }
}
