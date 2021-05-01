package com.heidan.singleton02;

public class SingletonTest03 {

}

//懒汉式：线程不安全
class Singleton03{
    private static Singleton03 instance;
    private Singleton03(){}
    public static Singleton03 getInstance(){
        if (instance==null){//多个线性在这里同时进来，会产生多个实例
            instance = new Singleton03();
        }
        return instance;
    }
}
