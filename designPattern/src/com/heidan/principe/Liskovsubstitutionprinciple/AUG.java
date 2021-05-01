package com.heidan.principe.Liskovsubstitutionprinciple;

public class AUG extends Rifle {
    public void zoomOut(){
        System.out.println("通过望远镜观察敌人");
    }

    @Override
    public void shoot() {
        System.out.println("AUG射击");
    }
}
