package com.heidan.designpattern.proxypattern.constraintproxy;

public class Client {
    public static void main(String[] args) {
        //定义一个游戏的角色
        GamePlayer gamePlayer = new GamePlayerImpl("秦泽");
        System.out.println(System.currentTimeMillis());
        gamePlayer.login("qinze","password");
        gamePlayer.killBoss();
        gamePlayer.upgrade();
        System.out.println(System.currentTimeMillis());
    }
}
