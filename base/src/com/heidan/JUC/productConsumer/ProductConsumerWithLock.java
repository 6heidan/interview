package com.heidan.JUC.productConsumer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProductConsumerWithLock {
    public static void main(String[] args) {
        Source source = new Source();
        new Thread(()->{
            for (int i = 1; i <= 10; i++) {
                source.increment();
            }
        },"A").start();

        new Thread(()->{
            for (int i = 1; i <= 10; i++) {
                source.decrement();
            }
        },"B").start();

        new Thread(()->{
            for (int i = 1; i <= 10; i++) {
                source.increment();
            }
        },"C").start();

        new Thread(()->{
            for (int i = 1; i <= 10; i++) {
                source.decrement();
            }
        },"D").start();
    }
}

class Source{
    private int number = 0;
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();
    public void increment(){
        lock.lock();
        try {
            while (number!=0){
                condition.await();
            }
            number++;
            System.out.println(Thread.currentThread().getName() + "\t" + number);
            condition.signalAll();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void decrement(){
        lock.lock();
        try {
            while (number==0){
                condition.await();
            }
            number--;
            System.out.println(Thread.currentThread().getName() + "\t" + number);
            condition.signalAll();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

}
