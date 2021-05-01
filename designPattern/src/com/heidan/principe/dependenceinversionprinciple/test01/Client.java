package com.heidan.principe.dependenceinversionprinciple.test01;

public class Client {
    public static void main(String[] args) {
        Driver heidan = new Driver();
        Benz benz = new Benz();
        heidan.driver(benz);
    }
}
