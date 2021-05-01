package com.heidan.designpattern.proxypattern.demo04;

import com.heidan.designpattern.proxypattern.demo01.GamePlayer;

public class Client {
    public static void main(String[] args) {
        //然后再定义一个代练者
        GamePlayer proxy = new GamePlayerProxy("黑蛋");
        //开始打游戏，记下时间戳
        System.out.println(System.currentTimeMillis());
        proxy.login("heidan","password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间是："+System.currentTimeMillis());
    }

}
