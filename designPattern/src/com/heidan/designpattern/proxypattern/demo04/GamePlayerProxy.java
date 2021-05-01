package com.heidan.designpattern.proxypattern.demo04;

import com.heidan.designpattern.proxypattern.demo01.GamePlayer;

public class GamePlayerProxy implements GamePlayer{
    private GamePlayer gamePlayer = null;
    //通过构造函数传递要对谁进行代练
    public GamePlayerProxy(String name)  {
        try {
            gamePlayer = new GamePlayerImpl(this,name);
        } catch (Exception e) {
            //TODO异常处理
        }
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
