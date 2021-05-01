package com.heidan.JUC.spin;

import java.util.concurrent.TimeUnit;

public class SpinLockTest {
    public static void main(String[] args) {
        //底层使用CAS
        SpinLockDemo spinLock = new SpinLockDemo();

        new Thread(()->{
            spinLock.myLock();
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                spinLock.myUnLock();
            }
        },"T1").start();

        new Thread(()->{
            spinLock.myLock();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                spinLock.myUnLock();
            }
        },"T2").start();

    }
}
