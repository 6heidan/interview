package com.heidan.principe.interfaceSegregationprinciple.test01;

public class Client {
    public static void main(String[] args) {
        PrettyGirl heidan = new PrettyGirlImpl("黑蛋");
        AbstractSearcher searcher = new Searcher(heidan);
        searcher.show();

    }
}
