package com.heidan.common.innerclass;

public class OuterClass02 {
    private String outerName;
    public void display(){
        class InnerClass{
            public void print(){
                System.out.println("method inner class");
            }
        }
        InnerClass innerClass = new InnerClass();
        innerClass.print();
    }

    public static void main(String[] args) {
        OuterClass02 outerClass02 = new OuterClass02();
        outerClass02.display();
    }
}
