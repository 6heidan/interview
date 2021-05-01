package com.heidan.JUC.productConsumer;

public class ProductConsumerWithSynchronized {
    public static void main(String[] args) {
        Data data = new Data();
        new Thread(()->{
            for (int i = 1; i <= 10; i++) {
                try {
                    data.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"A").start();

        new Thread(()->{
            for (int i = 1; i <= 10; i++) {
                try {
                    data.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"B").start();

        new Thread(()->{
            for (int i = 1; i <= 10; i++) {
                try {
                    data.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"C").start();

        new Thread(()->{
            for (int i = 1; i <= 10; i++) {
                try {
                    data.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"D").start();
    }
}

class Data{
    private int number = 0;
    public synchronized void increment() throws InterruptedException {
        while (number!=0){
            this.wait();
        }
        number++;
        System.out.println(Thread.currentThread().getName() + "\t"+number);
        this.notifyAll();
    }

    public synchronized void decrement() throws InterruptedException {
        while (number==0){
            this.wait();
        }
        number--;
        System.out.println(Thread.currentThread().getName() + "\t" + number);
        this.notifyAll();
    }
}

