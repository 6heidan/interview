package com.heidan.JUC.productConsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ProductConsumerWithBlockQueue {
    public static void main(String[] args) {
        Share share = new Share(new ArrayBlockingQueue<>(10));
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"\t生产线程启动");
            try {
                share.myProduct();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"Product").start();

        new Thread(()->{
            System.out.println(Thread.currentThread().getName() + "\t消费线程启动");
            System.out.println();
            System.out.println();
            try {
                share.myConsumer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"Consumer").start();

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println();
        System.out.println("5秒钟时间到，main线程叫停，活动结束");

        share.stop();
    }
}

class Share{
    private volatile boolean FLAG = true;
    private AtomicInteger atomicInteger = new AtomicInteger();
    private BlockingQueue<String> blockingQueue = null;
    public Share(BlockingQueue<String> blockingQueue){
        this.blockingQueue = blockingQueue;
    }

    public void myProduct() throws InterruptedException {
        String data = null;
        boolean retValue;
        while (FLAG){
            data = atomicInteger.incrementAndGet() + "";
            retValue = blockingQueue.offer(data,2L, TimeUnit.SECONDS);
            if (retValue){
                System.out.println(Thread.currentThread().getName() + "\t 插入队列"+data+"成功");
            }else {
                System.out.println(Thread.currentThread().getName() + "\t插入队列"+data+"失败");
            }
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println(Thread.currentThread().getName()+"\t叫停,表示FLAG=true，生产动作结束");
    }

    public void myConsumer() throws InterruptedException {
        String result = null;
        while (FLAG){
            result = blockingQueue.poll(2L,TimeUnit.SECONDS);
            if (null==result || result.equalsIgnoreCase("")){
                FLAG=false;
                System.out.println(Thread.currentThread().getName() + "\t超过2秒没有消费，消费退出");
                System.out.println();
                System.out.println();
                return;
            }
            System.out.println(Thread.currentThread().getName()+"\t消费队列"+result+"成功");
        }
    }

    public void stop(){
        this.FLAG = false;
    }

}
