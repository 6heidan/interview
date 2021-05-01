package com.heidan.principe.interfaceSegregationprinciple.test02;

public class PrettyGirl implements GoodBodyGirl,GreatTemperamentGirl {
    private String name;
    public PrettyGirl(String name){
        this.name = name;
    }
    @Override
    public void goodLooking() {
        System.out.println("====脸蛋很漂亮========");
    }

    @Override
    public void niceFigure() {
        System.out.println("======身材非常棒=========");
    }

    @Override
    public void greatTemperament() {
        System.out.println("======气质非常好============");
    }
}
