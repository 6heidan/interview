package com.heidan.singleton;

public class Singleton03 {
    private static volatile Singleton03 instance;
    private Singleton03(){
        System.out.println(Thread.currentThread().getName() + "\tok");
    }

    public static Singleton03 getInstance(){
        if (instance==null){
            synchronized (Singleton03.class){
                if (instance==null){
                    instance = new Singleton03();//不是原子性操作，极端情况下会有问题
                }
            }
        }
        return instance;
    }

    //多线程
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            new Thread(()->{
                Singleton03.getInstance();
            },String.valueOf(i)).start();
        }
    }
}
