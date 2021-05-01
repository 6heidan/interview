package com.heidan.designpattern.factorymethodpattern.demo02;

//这是一个通用性很强，易扩展的框架
public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);
        /**
         * 继续业务处理
         */
    }
}
