package com.heidan.designpattern.abstractfactorypattern.demo01;

public class MaleBlackHuman extends AbstractBlackHuman {
    @Override
    public void getSex() {
        System.out.println("黑人男性");
    }
}
