package com.heidan.designpattern.proxypattern.constraintproxy;

public interface GamePlayer {
    public void login(String user, String password);
    public void killBoss();
    public void upgrade();
    //每个人都可以找一下自己的代理
    public GamePlayer getProxy();
}
