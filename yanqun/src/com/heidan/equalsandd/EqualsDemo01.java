package com.heidan.equalsandd;

public class EqualsDemo01 {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1==obj2);
        System.out.println(obj1.equals(obj2));
    }

}
