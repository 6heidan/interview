package com.heidan.fqy;

public class IntegerTest {
    public static void main(String[] args) {
        Integer i1 = new Integer(12);
        Integer i2 = new Integer(12);
        System.out.println(i1==i2);//false
        System.out.println(i1.equals(i2));//true

        Integer i3 = 127;
        Integer i4 = 127;
        int i5 = 127;
        System.out.println(i3==i4);//true
        System.out.println(i3==i5);//true

        //Integer和int做比较的时候，Integer会自动拆箱成int类型，然后跟基本数据类型作比较
        Integer i6 = 128;
        Integer i7 = 128;
        int i8 = 128;
        System.out.println(i6==i7);//false
        System.out.println(i6==i8);//true
    }
}
