package com.heidan.fqy;

public class EqualsTest {
    public static void main(String[] args) {
        String s1 = new String("zs");
        String s2 = new String("zs");
        System.out.println(s1==s2);//false
        System.out.println(s1.equals(s2));//true：String重写了equals方法

        String s3 = "zs";
        String s4 = "zs";
        System.out.println(s3==s4);//true
        System.out.println(s3.equals(s4));//true
        System.out.println(s3==s1);//false
        System.out.println("========"+s3.equals(s1));

        String s5 = "zszs";
        String s6 = s3+s4;
        System.out.println(s5==s6);//false
        System.out.println(s5.equals(s6));//true


    }
}
