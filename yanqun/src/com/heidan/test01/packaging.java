package com.heidan.test01;

public class packaging {
    public static void main(String[] args) {
        //装箱：基本类型变为包装类型
        //拆箱：包装类型拆为基本类型
        Integer n1 = new Integer(10);
        Integer n3 = 10;
        int n2 = 10;
        System.out.println(n1==n2);//Integer = int ：先拆箱，后比较
        System.out.println(n1==n3);
    }

}
