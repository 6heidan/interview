package com.heidan.chapter02.demo01;

public class ClassInitTest {
    private static int num = 1;

    static {
        num = 2;
        number = 20;
        //System.out.println(num);//没问题
        //System.out.println(number);//非法的前向引用
    }

    private static int number = 10;//linking之prepare: number=0  --> initial:20   --> 10

    public static void main(String[] args) {
        System.out.println(ClassInitTest.num);//2
        System.out.println(number);//10
    }
}
