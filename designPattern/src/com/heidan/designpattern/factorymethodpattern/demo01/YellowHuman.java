package com.heidan.designpattern.factorymethodpattern.demo01;

public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄色人种的皮肤颜色是黄色的");
    }

    @Override
    public void talk() {
        System.out.println("黄色人种会说话，一般说的都是普通话");
    }
}
