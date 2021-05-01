package com.heidan.designpattern.proxypattern.demo005;

import com.heidan.designpattern.proxypattern.constraintproxy.GamePlayer;

public class GamePlayerProxy implements Proxy {
    private GamePlayer gamePlayer = null;
    public GamePlayerProxy(GamePlayer gamePlayer){
        this.gamePlayer = gamePlayer;
    }
    public void login(String user,String password){
        this.gamePlayer.login(user, password);
    }
    public void killBoss(){
        this.gamePlayer.killBoss();
    }
    public void upgrade(){
        this.gamePlayer.upgrade();
    }
    @Override
    public void count() {
        System.out.println("升级总用是：150元");
    }
}
