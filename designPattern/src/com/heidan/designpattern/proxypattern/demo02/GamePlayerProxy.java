package com.heidan.designpattern.proxypattern.demo02;

import com.heidan.designpattern.proxypattern.demo01.GamePlayer;

public class GamePlayerProxy implements GamePlayer {
    private GamePlayer gamePlayer = null;
    //通过构造函数传递要对谁进行代练
    public GamePlayerProxy(GamePlayer gamePlayer){
        this.gamePlayer = gamePlayer;
    }
    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }
}
