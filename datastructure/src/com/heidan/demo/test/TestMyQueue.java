package com.heidan.demo.test;

import com.heidan.demo.MyQueue;

public class TestMyQueue {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
    }
}
