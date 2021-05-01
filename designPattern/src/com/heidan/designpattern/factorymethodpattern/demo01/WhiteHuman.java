package com.heidan.designpattern.factorymethodpattern.demo01;

public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白色人种的皮肤颜色是白色的");
    }

    @Override
    public void talk() {
        System.out.println("白色人种会说话，说的是英文");
    }
}
