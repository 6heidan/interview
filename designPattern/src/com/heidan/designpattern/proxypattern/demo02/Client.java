package com.heidan.designpattern.proxypattern.demo02;

import com.heidan.designpattern.proxypattern.demo01.GamePlayer;
import com.heidan.designpattern.proxypattern.demo01.GamePlayerImpl;

public class Client {
    public static void main(String[] args) {
        //定义一个痴迷的玩家
        GamePlayer gamePlayer = new GamePlayerImpl("秦泽");
        //然后再定义一个代练者
        GamePlayer proxy = new GamePlayerProxy(gamePlayer);
        System.out.println(System.currentTimeMillis());
        proxy.login("qinze","123");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println(System.currentTimeMillis());
    }
}
