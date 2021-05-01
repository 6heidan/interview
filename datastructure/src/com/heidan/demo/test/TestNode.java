package com.heidan.demo.test;

import com.heidan.demo.Node;

public class TestNode {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.append(node2).append(node3).append(new Node(4));
//        System.out.println(node1.next().next().getData());
//        System.out.println(node1.next().next().next().isLast());
        node1.show();
//        node1.removeNext();
//        node1.show();
        Node node5 = new Node(5);
        node1.next().after(node5);
        node1.show();

    }
}
