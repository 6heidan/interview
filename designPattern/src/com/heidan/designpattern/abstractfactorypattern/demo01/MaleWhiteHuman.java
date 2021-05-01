package com.heidan.designpattern.abstractfactorypattern.demo01;

public class MaleWhiteHuman extends AbstractWhiteHuman {
    @Override
    public void getSex() {
        System.out.println("白人男性");
    }
}
