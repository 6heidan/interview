package com.heidan.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo01 {
    public static void main(String[] args) {
        Integer i1 = new Integer(12);
        Integer i2 = new Integer(12);
        System.out.println(i1==i2);//false

        Integer i3 = 126;
        Integer i4 = 126;
        int i5= 126;
        System.out.println(i3 == i4);//true    缓存区：-128~127
        System.out.println(i3 == i5);//true     自动拆箱，比较的是数值

        Integer i6 = 128;
        Integer i7 = 128;
        int i8 = 128;
        System.out.println(i6==i7);//false
        System.out.println(i6==i8);//true   自动拆箱，比较的是数值

    }
}
