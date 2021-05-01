package com.heidan.syn;

import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        Data data = new Data();
        //线程A
        new Thread(()->{
            data.function1();
        },"A").start();

        new Thread(()->{
            data.function2();
        },"B").start();
    }
}

class Data{
    public void function1(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("1...");
    }

    public void function2(){
        System.out.println("2...");
    }
}
