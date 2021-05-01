package com.heidan.singleton02;

public class SingletonTest02 {
    public static void main(String[] args) {

    }
}

//缺点：会造成内存的浪费
class Singleton02{
    private static Singleton02 instance;
    private Singleton02(){}
    static {
        instance = new Singleton02();
    }
    public static Singleton02 getInstance(){
        return instance;
    }
}
