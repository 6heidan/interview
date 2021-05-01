package com.heidan.designpattern.abstractfactorypattern.demo01;

public class FemaleWhiteHuman extends AbstractWhiteHuman {
    @Override
    public void getSex() {
        System.out.println("白人女性");
    }
}
