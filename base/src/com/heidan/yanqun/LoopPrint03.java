package com.heidan.yanqun;

import java.util.concurrent.Semaphore;

public class LoopPrint03 {
    Semaphore semaphore1 = new Semaphore(1);
    Semaphore semaphore2 = new Semaphore(0);
    Semaphore semaphore3 = new Semaphore(0);

    public static void main(String[] args) {
        LoopPrint03 loopPrint03 = new LoopPrint03();
        new Thread(()->{loopPrint03.printA();},"A").start();
        new Thread(()->{loopPrint03.printB();},"B").start();
        new Thread(()->{loopPrint03.printC();},"C").start();
    }

    public void printA(){
        print("1",semaphore1,semaphore2);
    }

    public void printB(){
        print("2",semaphore2,semaphore3);
    }

    public void printC(){
        print("3",semaphore3,semaphore1);
    }

    /**
     * @param value：当前值 1 2 3
     * @param current：当前谁拿许可证
     * @param next：下一个谁拿许可证
     */
    public void print(String value,Semaphore current,Semaphore next){
        while (true){
            try {
                current.acquire();//当前信号量，获取许可证
                System.out.println(Thread.currentThread().getName() + "\t" +value);
                next.release();//将许可证传递给下一个
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
