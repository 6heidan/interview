package com.heidan.chapter05.demo01;

/**
 * 默认情况下：count：11420
 * 设置栈的大小：-Xss256k   count:2456
 */
public class StackOverflowErrorTest {
    private static int count = 1;
    public static void main(String[] args) {
        System.out.println(count);
        count++;
        main(args);
    }
}
