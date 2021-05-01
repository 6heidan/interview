package com.heidan.common;

public class ClassLoaderTest {
    public static void main(String[] args) {
        String s = new String();
        System.out.println(s.getClass().getClassLoader());//null
        //为什么是空呢？因为BootStrap不是用java语言写的，而是用C写的，所以不能用java的方式获取到

        Demo01 demo01 = new Demo01();
        System.out.println(demo01.getClass().getClassLoader());//AppClassLoader
        System.out.println(demo01.getClass().getClassLoader().getParent());//ExtClassLoader
        System.out.println(demo01.getClass().getClassLoader().getParent().getParent());//null

    }
}
