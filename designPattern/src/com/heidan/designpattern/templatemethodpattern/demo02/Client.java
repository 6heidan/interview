package com.heidan.designpattern.templatemethodpattern.demo02;

public class Client {
    public static void main(String[] args) {
        AbstractClass concreteClass1 = new ConcreteClass1();
        AbstractClass concreteClass2 = new ConcreteClass2();
        //调用模板方法
        concreteClass1.templateMethod();
        concreteClass2.templateMethod();
    }
}
