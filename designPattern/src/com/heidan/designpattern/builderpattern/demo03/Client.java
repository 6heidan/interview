package com.heidan.designpattern.builderpattern.demo03;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        //1万辆A类型的奔驰车
        for (int i = 0; i < 100; i++) {
            director.getABenzModel().run();
        }
        for (int i = 0; i < 100; i++) {
            director.getBBenzModel().run();
        }
        for (int i = 0; i < 100; i++) {
            director.getCBMWModel().run();
        }
    }
}
