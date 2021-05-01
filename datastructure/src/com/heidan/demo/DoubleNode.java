package com.heidan.demo;

public class DoubleNode {

    DoubleNode pre = this;
    DoubleNode next = this;
    int data;

    public DoubleNode(int data){
        this.data = data;
    }

    public void after(DoubleNode node){
        DoubleNode nextNext = next;
        this.next = node;
        node.pre = this;
        node.next = nextNext;
        nextNext = node;
    }

    public DoubleNode next(){
        return this.next;
    }

    public DoubleNode pre(){
        return this.pre;
    }

    public int getData(){
        return this.data;
    }

}
