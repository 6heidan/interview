package com.heidan.demo;

import java.util.Stack;

public class StackImplQueue {
    private Stack<Integer> stackPush;
    private Stack<Integer> stackPop;

    public StackImplQueue(){
        stackPush = new Stack<>();
        stackPop = new Stack<>();
    }

    public void push(int x){
        stackPush.push(x);
    }

    public int pop(){
        if (stackPop.empty()){
            while (!stackPush.empty()){
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.pop();
    }

    public int peek(){
        if (stackPop.empty()){
            while (!stackPush.empty()){
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.peek();
    }

    public boolean empty(){
        return stackPush.empty() && stackPop.empty();
    }
}
