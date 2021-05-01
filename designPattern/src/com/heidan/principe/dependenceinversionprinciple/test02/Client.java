package com.heidan.principe.dependenceinversionprinciple.test02;

public class Client {
    public static void main(String[] args) {
        Driver heidan = new DriverImpl();
        Car benz = new Benz();
        Car bmw = new BMW();
        heidan.driver(benz);
        heidan.driver(bmw);
    }
}
