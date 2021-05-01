package com.heidan.principe.interfaceSegregationprinciple.test01;

public class PrettyGirlImpl implements PrettyGirl {
    private String name;
    public PrettyGirlImpl(String name){
        this.name = name;
    }
    @Override
    public void goodLooking() {
        System.out.println(this.name + "脸蛋很漂亮");
    }

    @Override
    public void niceFigure() {
        System.out.println(this.name + "身材非常好");
    }

    @Override
    public void greatTemperament() {
        System.out.println(this.name + "气质非常好");
    }
}
