package com.heidan.designpattern.abstractfactorypattern.demo01;

public class FemaleBlackHuman extends AbstractBlackHuman {
    @Override
    public void getSex() {
        System.out.println("黑人女性");
    }
}
