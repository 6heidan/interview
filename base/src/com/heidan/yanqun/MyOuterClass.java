package com.heidan.yanqun;

public class MyOuterClass {
    int i = 10;
    class MyInnerClass{
        int i = 20;
        public void myMethod(){
            int i = 30;
            System.out.println(i);
            System.out.println(this.i);
            System.out.println(MyOuterClass.this.i);
        }
    }

    public static void main(String[] args) {
        //如果内部类有static修饰，可以直接new
        MyInnerClass innerClass = new MyOuterClass().new MyInnerClass();
        innerClass.myMethod();
    }
}
