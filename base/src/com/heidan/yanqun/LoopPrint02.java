package com.heidan.yanqun;


public class LoopPrint02 {
    public static void main(String[] args) {
        Data02 data02 = new Data02();
        new Thread(()->{
            try {
                while (true){
                    data02.printA();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"t1").start();

        new Thread(()->{
            try {
                while (true){
                    data02.printB();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"t2").start();

        new Thread(()->{
            try {
                while (true){
                    data02.printC();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"t3").start();
    }
}

class Data02{
    int number = 1;

    public synchronized void printA() throws InterruptedException {
        while (number!=1){
            this.wait();
        }
        System.out.println("AAA");
        number=2;
        this.notifyAll();
    }

    public synchronized void printB() throws InterruptedException {
        while (number!=2){
            this.wait();
        }
        System.out.println("BBB");
        number=3;
        this.notifyAll();
    }

    public synchronized void printC() throws InterruptedException {
        while (number!=3){
            this.wait();
        }
        System.out.println("CCC");
        number=1;
        this.notifyAll();
    }
}
