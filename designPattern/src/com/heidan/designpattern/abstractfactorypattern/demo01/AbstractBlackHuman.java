package com.heidan.designpattern.abstractfactorypattern.demo01;

public abstract class AbstractBlackHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("黑色人种的皮肤颜色是黑色的");
    }

    @Override
    public void talk() {
        System.out.println("黑色人种说英文");
    }
}
