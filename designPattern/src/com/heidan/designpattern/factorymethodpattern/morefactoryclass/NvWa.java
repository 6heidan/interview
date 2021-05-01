package com.heidan.designpattern.factorymethodpattern.morefactoryclass;

import com.heidan.designpattern.factorymethodpattern.demo01.Human;

public class NvWa {
    public static void main(String[] args) {
        System.out.println("==造出的第一批人是白色人种==");
        Human whiteHuman = new WhiteHumanFactory().createHuman();
        whiteHuman.getColor();
        whiteHuman.talk();

        System.out.println("==造出的第二批人是黑色人种==");
        Human blackHuman = new BlackHumanFactory().createHuman();
        blackHuman.getColor();
        blackHuman.talk();

        System.out.println("==造出的第三批人是黄色人种==");
        Human yellowHuman = new YellowHumanFactory().createHuman();
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
