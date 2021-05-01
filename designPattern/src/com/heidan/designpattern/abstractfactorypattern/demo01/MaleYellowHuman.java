package com.heidan.designpattern.abstractfactorypattern.demo01;

public class MaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("黄人男性");
    }
}
