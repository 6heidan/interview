package com.heidan.designpattern.singletonpattern.demo01;

public class Minister {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Emperor emperor = Emperor.getInstance();
            emperor.say();
        }
    }
}
