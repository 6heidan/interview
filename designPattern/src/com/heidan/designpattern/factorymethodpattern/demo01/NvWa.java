package com.heidan.designpattern.factorymethodpattern.demo01;

public class NvWa {
    public static void main(String[] args) {
        //声明阴阳八卦炉
        AbstractHumanFactory yinYangLu = new HumanFactory();
        System.out.println("==造出第一批是白色人种==");
        Human whiteHuman = yinYangLu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        System.out.println("==造出的第二批是黑色人种==");
        Human blackHuman = yinYangLu.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();

        System.out.println("==造出的第三批是黄色人种==");
        Human yellowHuman = yinYangLu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
