package com.heidan.singleton;

public class Singleton01 {

    //浪费空间
    private byte[] data1 = new byte[1024*1024];
    private byte[] data2 = new byte[1024*1024];
    private byte[] data3 = new byte[1024*1024];
    private byte[] data4 = new byte[1024*1024];

    //饿汉式
    private static Singleton01 instance = new Singleton01();
    private Singleton01(){}

    public static Singleton01 getInstance(){
        return instance;
    }

}
