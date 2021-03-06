package com.heidan.JUC;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(7);
        for (int i = 1; i <= 7; i++) {
            new Thread(()->{
                System.out.println(Thread.currentThread().getName() + "\t离开教室");
                countDownLatch.countDown();
            },String.valueOf(i)).start();
        }
        countDownLatch.await();
        System.out.println(Thread.currentThread().getName()+"\t班长锁门");
    }
}
