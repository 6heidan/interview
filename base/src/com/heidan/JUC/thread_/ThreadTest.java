package com.heidan.JUC.thread_;

public class ThreadTest {
    public static void main(String[] args) {
        new MyThread01().start();//创建并启动线程

        MyThread02 myThread02 = new MyThread02();
        Thread thread = new Thread(myThread02);
        thread.start();


    }
}

class MyThread01 extends Thread{
    @Override
    public void run() {
        System.out.println("extends Thread run");
    }
}

class MyThread02 implements Runnable{

    @Override
    public void run() {
        System.out.println("Runnable run");
    }
}
