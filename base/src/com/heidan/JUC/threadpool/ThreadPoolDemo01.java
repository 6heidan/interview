package com.heidan.JUC.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo01 {
    public static void main(String[] args) {
//        ExecutorService threadPool = Executors.newSingleThreadExecutor();//单个线程
//        ExecutorService threadPool = Executors.newFixedThreadPool(3);//固定大小线程池
        ExecutorService threadPool = Executors.newCachedThreadPool();//看情况自调节
        try {
            for (int i=1;i<=10;i++){
                threadPool.execute(()->{
                    System.out.println(Thread.currentThread().getName() + "\tok");
                });
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            threadPool.shutdown();
        }

    }
}
