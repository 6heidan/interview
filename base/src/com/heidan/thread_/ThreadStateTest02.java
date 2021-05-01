package com.heidan.thread_;

public class ThreadStateTest02 {
    public static void main(String[] args) throws InterruptedException {
        BlockTask blockTask = new BlockTask();
        Thread t1 = new Thread(blockTask);
        Thread t2 = new Thread(blockTask);
        t1.start();
        t2.start();
        //从严谨的角度来说，t1线程不一定会先执行，此处是假设t1先执行
        System.out.println(t1.getState());//RUNNABLE
        System.out.println(t2.getState());//BLOCKED
        Thread.sleep(10);
        System.out.println(t1.getState());//TIMED_WAITING
        Thread.sleep(1000);
        System.out.println(t1.getState());//WAITING
    }
}

class BlockTask implements Runnable{

    @Override
    public void run() {
        synchronized (this){
            //另一个线程会进入block状态
            try {
                //目的是让线程进入waiting time状态
                Thread.sleep(1000);
                //进入waiting状态
                wait();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

