package com.heidan.principe.interfaceSegregationprinciple.test01;

public class Searcher extends AbstractSearcher {
    public Searcher(PrettyGirl prettyGirl) {
        super(prettyGirl);
    }

    @Override
    public void show() {
        System.out.println("==========美女信息如下==============");
        super.prettyGirl.goodLooking();
        super.prettyGirl.greatTemperament();
        super.prettyGirl.niceFigure();
    }
}
