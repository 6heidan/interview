package com.heidan.designpattern.proxypattern.dynamic;

import com.heidan.designpattern.proxypattern.constraintproxy.GamePlayer;
import com.heidan.designpattern.proxypattern.constraintproxy.GamePlayerImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

//跑起来和书上的不一致
public class Client {
    public static void main(String[] args) {
        //定义一个痴迷的玩家
        GamePlayer player = new GamePlayerImpl("张三");
        //定义一个handler
        InvocationHandler handler = new GamePlayIH(player);
        System.out.println(System.currentTimeMillis());
        //获得类的class loader
        ClassLoader cl = player.getClass().getClassLoader();
        //动态产生一个代理者
        GamePlayer proxy = (GamePlayer) Proxy.newProxyInstance(cl, new Class[]{GamePlayer.class}, handler);
        //登录
        proxy.login("zhangsan","password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println(System.currentTimeMillis());
    }
}
