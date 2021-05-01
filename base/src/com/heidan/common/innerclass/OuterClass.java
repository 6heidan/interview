package com.heidan.common.innerclass;

public class OuterClass {
    //成员变量
    private String outerName;
    //成员方法
    public void display(){
        System.out.println("OuterClass display");
        System.out.println(outerName);
    }
    //内部类
    public class InnerClass{
        private String innerName;
        public void display(){
            System.out.println("InnerClass display");
            System.out.println(innerName);
        }
        public InnerClass(){
            innerName = "inner Class";
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.display();
        InnerClass innerClass = outerClass.new InnerClass();
        innerClass.display();
    }

}
