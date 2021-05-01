package com.heidan.demo.test;

import com.heidan.demo.ArrayImplQueue;

public class ArrayImplQueueTest {
    public static void main(String[] args) {
        ArrayImplQueue arrayImplQueue = new ArrayImplQueue(5);
        System.out.println(arrayImplQueue.isEmpty());
        arrayImplQueue.addQueue(25);
        arrayImplQueue.addQueue(26);
        System.out.println(arrayImplQueue.isEmpty());
        arrayImplQueue.showQueue();
        System.out.println(arrayImplQueue.getQueue());
        arrayImplQueue.showQueue();
        System.out.println(arrayImplQueue.headQueue());
    }
}
