package com.heidan.demo.test;

import java.util.HashSet;
import java.util.Set;

public class StudentTest {
    public static void main(String[] args) {
        Set set = new HashSet();
        System.out.println(set.add(new Student("张三",70)));
        System.out.println(set.add(new Student("李四",80)));
        System.out.println(set.add(new Student("张三",70)));

        //true
        //true
        //false
    }
}
