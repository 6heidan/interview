package com.heidan.aobing.future;

public class RealData {
    protected final String result;

    public RealData(String para){
        StringBuffer sb = new StringBuffer();
        //假设这里很慢很慢，构造RealData不是一个容易的事
        result = sb.toString();
    }
    public String getResult(){
        return result;
    }
}
