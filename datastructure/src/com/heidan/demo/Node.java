package com.heidan.demo;

public class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }

    public Node append(Node node){
        Node currentNode = this;
        while (true){
            Node nextNode = currentNode.next;
            if (nextNode==null){
                break;
            }
            currentNode = nextNode;
        }
        currentNode.next = node;
        return this;
    }

    public void after(Node node){
        Node newNext = next;
        this.next = node;
        node.next = newNext;
    }

    public void show(){
        Node currentNode = this;
        while (true){
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
            if (currentNode==null){
                break;
            }
        }
        System.out.println();
    }

    public void removeNext(){
        Node newNext = next.next;
        this.next = newNext;
    }

    public Node next(){
        return this.next;
    }

    public int getData(){
        return this.data;
    }

    public boolean isLast(){
        return next==null;
    }

}
