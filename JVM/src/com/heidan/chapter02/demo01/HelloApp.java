package com.heidan.chapter02.demo01;

public class HelloApp {
    private static int a = 1;   //prepare: a = 0   ---->   initial: a = 1
    //如果加了final的话，在编译的时候就分配了，准备阶段会显式初始化

    public static void main(String[] args) {
        System.out.println(a);
    }
}
