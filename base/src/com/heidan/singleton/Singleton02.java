package com.heidan.singleton;

public class Singleton02 {

    //懒汉式
    private static Singleton02 instance = null;
    private Singleton02(){
        System.out.println(Thread.currentThread().getName() + "\tok");
    }

    public static Singleton02 getInstance(){
        if (instance==null){
            instance = new Singleton02();
        }
        return instance;
    }

    //多线程情况下有问题
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            new Thread(()->{
                Singleton02.getInstance();
            },String.valueOf(i)).start();
        }
    }
}
