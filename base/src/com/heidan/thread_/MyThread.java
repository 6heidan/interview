package com.heidan.thread_;

import java.util.concurrent.Callable;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "\trunning...");
    }
}

class Test{
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        //正确启动线程的方式
//        myThread.run();//调用方法并非开启新线程
        myThread.start();

        MyTask myTask = new MyTask();
//        myTask.start();//并不能直接以线程的方式来启动
        //它表达的是一个任务，需要启动一个线程来执行
        new Thread(myTask).start();
    }
}

//实现Runnable只是创建了一个可执行任务，并不是一个线程
class MyTask implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "\trunning...");
    }
}

class MyTask2 implements Callable<Boolean>{

    @Override
    public Boolean call() throws Exception {
        return null;
    }
}