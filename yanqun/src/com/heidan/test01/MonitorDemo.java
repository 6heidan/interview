package com.heidan.test01;

import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.Monitor;
import com.google.common.util.concurrent.MoreExecutors;

import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class MonitorDemo {
    private LinkedList<Integer> buffer = new LinkedList<>();
    private static final int MAX = 10;
    private static AtomicInteger count = new AtomicInteger(10);
    private Monitor monitor = new Monitor();

    public void produce(int value){
        try {
            monitor.enterWhen(monitor.newGuard(()->buffer.size()<MAX));
            buffer.addLast(value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            monitor.leave();
            System.out.println("生产完毕，缓冲区大小："+buffer.size());
        }
    }

    public int consume(){
        try {
            monitor.enterWhen(monitor.newGuard(()->!buffer.isEmpty()));
            return buffer.removeFirst();
        } catch (InterruptedException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally {
            monitor.leave();
            System.out.println("消费完毕，缓冲区大小："+buffer.size());
        }
    }

    public static void main(String[] args) {
        MonitorDemo monitorDemo = new MonitorDemo();
        ExecutorService executorService = Executors.newFixedThreadPool(6);
        //将线程池包装
        ListeningExecutorService listeningExecutorService = MoreExecutors.listeningDecorator(executorService);
        //向线程池放入3个生产者
        for (int i=0;i<3;i++){
            listeningExecutorService.submit(()->{
                while (true){
                int result = count.getAndIncrement();
                monitorDemo.produce(result);
                System.out.println("生产："+result);
            }
            });
        }

        //向线程池放入3个消费者
        for (int i=0;i<2;i++){
            while (true){
                int result = monitorDemo.consume();
                System.out.println("消费："+result);
            }
        }


    }

}
