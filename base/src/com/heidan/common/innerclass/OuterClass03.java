package com.heidan.common.innerclass;

public class OuterClass03 {
    private String outerName;
    public void display(){
        System.out.println("OutClass display");
        System.out.println(outerName);
    }
    public static class InnerClass{
        private String innerName;
        public InnerClass(){
            innerName = "inner class";
        }
        public void display(){
            System.out.println("InnerClass display");
            System.out.println(innerName);
        }
    }

    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();
        innerClass.display();
    }
}
