package com.heidan.principe.interfaceSegregationprinciple.test01;

public abstract class AbstractSearcher {
    protected  PrettyGirl prettyGirl;
    public AbstractSearcher(PrettyGirl prettyGirl){
        this.prettyGirl = prettyGirl;
    }

    public abstract void show();


}
