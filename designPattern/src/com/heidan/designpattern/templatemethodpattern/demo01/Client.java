package com.heidan.designpattern.templatemethodpattern.demo01;

public class Client {
    public static void main(String[] args) {
        //xx公司要H1型号的悍马
        HummerModel h1 = new HummerH1Model();
        //h1模型演示
        h1.run();
    }
}
