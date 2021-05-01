package com.heidan.designpattern.proxypattern.constraintproxy;

public class Client03 {
    public static void main(String[] args) {
        GamePlayer player = new GamePlayerImpl("李四");
        GamePlayer proxy = player.getProxy();
        System.out.println(System.currentTimeMillis());
        proxy.login("lisi","password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println(System.currentTimeMillis());
    }
}
