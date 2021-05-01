package com.heidan.common.innerclass;

public class Test {
    public static void main(String[] args) {
        //通过实现类的方式
        MyInterface myInterface = new MyImplement();
        myInterface.test();

        //匿名内部类的方式
        MyInterface myInterface1 = new MyInterface() {
            @Override
            public void test() {
                System.out.println("test");
            }
        };
        myInterface1.test();
    }
}
