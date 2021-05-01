package com.heidan.datastructure;

public class ReverseLinkedList {
    public Node reverseLinkedList(Node head){
        if (head==null || head.next==null){
            return head;
        }
        Node newNode = reverseLinkedList(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }

    public Node reverseLinkedList2(Node head){
        Node prev = null;
        Node curr = head;
        while (curr!=null){
            Node nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }



}

class Node{
    int data;
    Node next;
}
