package com.heidan.designpattern.proxypattern.demo01;

public class Client {
    public static void main(String[] args) {
        //定义一个痴迷的玩家
        GamePlayer player = new GamePlayerImpl("张三");
        //开始打游戏，记下时间戳
        System.out.println("开始时间是："+System.currentTimeMillis());
        player.login("heidan","123");
        player.killBoss();
        player.upgrade();
        //记录结束游戏时间
        System.out.println(System.currentTimeMillis());
    }
}
