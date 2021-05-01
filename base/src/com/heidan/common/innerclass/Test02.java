package com.heidan.common.innerclass;

public class Test02 {
    public class MyImplement implements MyInterface{

        @Override
        public void test() {
            System.out.println("test");
        }
    }

    public static void main(String[] args) {
        MyImplement myImplement = new Test02().new MyImplement();
        myImplement.test();
    }
}
