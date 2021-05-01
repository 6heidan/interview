package com.heidan.test02;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericDemo {

    public static <K,V> Map<K,V> mapInstance(){
        return new HashMap<K,V>();
    }

    public static void main(String[] args) {

        Map<String, List<Integer>> map = new HashMap<>();

        Map<String, List<Integer>> map2 = GenericDemo.mapInstance();
    }
}
