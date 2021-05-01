package com.heidan.designpattern.abstractfactorypattern.demo01;

public class FemaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("黄人女性");
    }
}
