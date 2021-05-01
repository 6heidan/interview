package com.heidan.demo.test;

import com.heidan.demo.MyStack;

public class TestMyStack {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        System.out.println(myStack.isEmpty());
        myStack.push(5);
        System.out.println(myStack.isEmpty());
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
    }
}
