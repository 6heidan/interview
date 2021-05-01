package com.heidan.demo;

//栈的底层是用数组实现的
public class MyStack {
    int[] elements;

    public MyStack(){
        elements = new int[0];
    }

    public boolean isEmpty(){
        return elements.length == 0;
    }

    public void push(int element) {
        int[] newArr = new int[elements.length+1];
        for (int i=0;i<elements.length;i++) {
            newArr[i] = elements[i];
        }
        newArr[newArr.length-1] = element;//两种写法：newArray.length-1    elements.length
        elements = newArr;
    }

    public int pop(){
        if (isEmpty()){
            throw new RuntimeException("stack is empty");
        }
        int element = elements[elements.length-1];
        int[] newArr = new int[elements.length-1];
        for (int i=0;i<elements.length-1;i++){
            newArr[i] = elements[i];
        }
        elements = newArr;
        return element;
    }

    public int peek(){
        if (isEmpty()){
            throw new RuntimeException("stack is empty");
        }
        return elements[elements.length-1];
    }

}
