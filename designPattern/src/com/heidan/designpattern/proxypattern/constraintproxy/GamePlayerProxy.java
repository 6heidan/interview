package com.heidan.designpattern.proxypattern.constraintproxy;

public class GamePlayerProxy implements GamePlayer {
    private GamePlayer gamePlayer = null;
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

    @Override
    public GamePlayer getProxy() {
        return this;
    }
}
