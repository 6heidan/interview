package com.heidan.singleton02;

public class SingletonTest04 {
    public static void main(String[] args) {

    }
}

class Singleton04{
    private static volatile Singleton04 instance;
    private Singleton04(){}

    public static Singleton04 getInstance(){
        if (instance==null){
            synchronized (Singleton04.class){
                if (instance==null){
                    instance = new Singleton04();
                }
            }
        }
        return instance;
    }
}
