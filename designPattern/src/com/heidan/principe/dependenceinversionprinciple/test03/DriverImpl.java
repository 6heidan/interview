package com.heidan.principe.dependenceinversionprinciple.test03;

import com.heidan.principe.dependenceinversionprinciple.test02.Car;

public class DriverImpl implements Driver {
    private Car car;

    public DriverImpl(Car car){
        this.car = car;
    }

    @Override
    public void driver() {
        this.car.run();
    }
}
