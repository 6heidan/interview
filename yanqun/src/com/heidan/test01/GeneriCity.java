package com.heidan.test01;

import java.util.ArrayList;
import java.util.List;

public class GeneriCity {
    public static void main(String[] args) {
//        List<Object> list = new ArrayList<String>();
        List<?> list = new ArrayList<String>();
        List<? extends Object> list1 = new ArrayList<String>();
    }
}
