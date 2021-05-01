package com.heidan.demo;

public class ArrayImplQueue {
    private int front;
    private int rear;
    private int[] arr;
    private int maxSize;

    public ArrayImplQueue(int arrMaxSize){
        maxSize = arrMaxSize;
        arr = new int[maxSize];
        front = -1;
        rear = -1;
    }

    public boolean isEmpty(){
        return front == rear;
    }

    public boolean isFull(){
        return rear == maxSize-1;
    }

    public void addQueue(int n){
        if (isFull()){
            System.out.println("队列满，不能添加数据");
            return;
        }
        rear++;
        arr[rear] = n;
    }

    public int getQueue(){
        if (isEmpty()){
            throw new RuntimeException("队列是空的，没有数据");
        }
        front++;
        return arr[front];
    }

    public void showQueue(){
        if (isEmpty()){
            System.out.println("队列是空的，没有数据");
            return;
        }
        for (int i=0;i<arr.length;i++){
            System.out.printf("arr[%d]=%d\t",i,arr[i]);
        }
        System.out.println();
    }

    public int headQueue(){
        if (isEmpty()){
            throw new RuntimeException("队列是空的，没有数据");
        }
        return arr[front+1];
    }


}
