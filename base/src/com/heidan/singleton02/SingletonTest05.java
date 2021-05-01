package com.heidan.singleton02;

public class SingletonTest05 {
    public static void main(String[] args) {

    }
}

//静态内部类：外部类加载的时候，内部类不会被加载，用到的时候才会被加载，而且只会加载一次，内部类是线程安全的
class Singleton05{
    private static volatile Singleton05 instance;
    private Singleton05(){}
    private static class SingletonInstance{
        //这里使用JVM提供的类加载机制实现实现线程安全：类进行初始化的时候，别的线程无法进入
        private static final Singleton05 instance = new Singleton05();
    }

    public static Singleton05 getInstance(){
        return SingletonInstance.instance;
    }
}
