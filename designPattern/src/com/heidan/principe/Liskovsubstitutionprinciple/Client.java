package com.heidan.principe.Liskovsubstitutionprinciple;

public class Client {
    public static void main(String[] args) {
        Soldier soldier = new Soldier();
        soldier.setGun(new Handgun());
        soldier.killEnemy();

        Sniper sniper = new Sniper();
        sniper.killEnemy(new AUG());

    }
}
