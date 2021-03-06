package com.heidan.designpattern.builderpattern.demo01;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        /**
         * 客户告诉xx公司，我要这样一个模型，然后xx公司就告诉我老大说要这样一个模型，
         * 这样一个顺序，然后我就来制造
         */
        BenzModel benz = new BenzModel();
        //存放run的顺序
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("engine boom");//客户要求，run的时候先发动引擎
        sequence.add("start");//启动起来
        sequence.add("stop");//开了一段时间就停下来
        //我们把这个顺序赋予奔驰车
        benz.setSequence(sequence);
        benz.run();

    }
}
