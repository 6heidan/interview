package com.heidan.thread_;

public class ThreadStateTest {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Task());
        System.out.println(thread.getState());//NEW
        thread.start();
        System.out.println(thread.getState());//RUNNABLE
        //保险起见，让当前主线程休眠一下
        thread.sleep(10);//休眠让Task中的for循环执行完
        System.out.println(thread.getState());//TERMINATED
    }
}

class Task implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
