package com.heidan.principe.dependenceinversionprinciple.test02;

public class DriverImpl implements Driver {
    @Override
    public void driver(Car car) {
        car.run();
    }
}
