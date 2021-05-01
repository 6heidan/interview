package com.heidan.designpattern.proxypattern.constraintproxy;

public class Client02 {
    public static void main(String[] args) {
        GamePlayer gamePlayer = new GamePlayerImpl("张三");
        GamePlayer proxy = new GamePlayerProxy(gamePlayer);
        System.out.println(System.currentTimeMillis());
        proxy.login("zhangsan","password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println(System.currentTimeMillis());
    }
}
