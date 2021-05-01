package com.heidan.singleton;

//静态内部类
public class Singleton04 {
    private Singleton04(){}

    public static class InnerClass{
        private static Singleton04 singleton04 = new Singleton04();
    }

    public static Singleton04 getInstance(){
        return InnerClass.singleton04;
    }
}
