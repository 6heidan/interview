package com.heidan.principe.Liskovsubstitutionprinciple;

public class MachineGun extends AbstractGun {
    @Override
    public void shoot() {
        System.out.println("机枪扫射");
    }
}
