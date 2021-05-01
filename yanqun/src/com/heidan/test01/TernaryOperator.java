package com.heidan.test01;

import java.util.HashMap;
import java.util.Map;

public class TernaryOperator {
    public static void main(String[] args) {
        int n1 = 1,n2 = 2;

        System.out.println(n1==n2 ? 100.0:200);
        System.out.println(n1==n2 ? 'A':66);
        System.out.println(n1==n2 ? 'A':66666);

        System.out.println(n1==n2 ? 'A':n2);
        System.out.println(n1!=n2 ? 'A':n2);

        Map<String,Integer> map = new HashMap<>();
        System.out.println(map==null ? 0:map.get(""));

    }
}
