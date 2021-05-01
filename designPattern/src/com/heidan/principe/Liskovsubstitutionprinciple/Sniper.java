package com.heidan.principe.Liskovsubstitutionprinciple;

public class Sniper {
    Rifle rifle;

    public void setRifle(Rifle rifle) {
        this.rifle = rifle;
    }

    public void killEnemy(AUG aug){
        aug.zoomOut();
        aug.shoot();
    }
}
