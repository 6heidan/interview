package com.heidan.JUC.fourfunctionalinterface;

import java.util.function.Function;

/**
 * Function函数式接口，有一个输入参数，有一个输出
 * 只要是函数型接口就可以用lambda表达式简化
 */
public class FunctionDemo {
    public static void main(String[] args) {
//        Function<String,String> function = new Function<String, String>() {
//            @Override
//            public String apply(String str) {
//                return str;
//            }
//        };
        Function<String,String> function = (str) -> {return str;};
        System.out.println(function.apply("dsa"));
    }
}
