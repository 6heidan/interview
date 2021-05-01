package com.heidan.demo;

public class LoopNode {
    int data;
    LoopNode next = this;

    public LoopNode(int data){
        this.data = data;
    }


    public void after(LoopNode node){
        LoopNode newNext = next;
        this.next = node;
        node.next = newNext;
    }


    public void removeNext(){
        LoopNode newNext = next.next;
        this.next = newNext;
    }

    public LoopNode next(){
        return this.next;
    }

    public int getData(){
        return this.data;
    }



}
