package com.heidan.yanqun;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LoopPrint {
    public static void main(String[] args) {
        Data data = new Data();
        new Thread(()->{
            while (true){
                data.printA();
            }
        },"t1").start();

        new Thread(()->{
            while (true){
                data.printB();
            }
        },"t1").start();

        new Thread(()->{
            while (true){
                data.printC();
            }
        },"t1").start();
    }

}

class Data{
    int number = 1;
    Lock lock = new ReentrantLock();
    Condition condition1 = lock.newCondition();
    Condition condition2 = lock.newCondition();
    Condition condition3 = lock.newCondition();

    public void printA(){
        lock.lock();
        try {
            while (number!=1){
                condition1.await();
            }
            System.out.println("AAA");
            number = 2;
            condition2.signal();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void printB(){
        lock.lock();
        try {
            while (number!=2){
                condition2.await();
            }
            System.out.println("BBB");
            number = 3;
            condition3.signal();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void printC(){
        lock.lock();
        try {
            while (number!=3){
                condition3.await();
            }
            System.out.println("CCC");
            number = 1;
            condition1.signal();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
