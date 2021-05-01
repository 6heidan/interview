package com.heidan.principe.dependenceinversionprinciple.test04;

import com.heidan.principe.dependenceinversionprinciple.test02.Car;

public class DriverImpl {
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void driver(){
        this.car.run();
    }
}
