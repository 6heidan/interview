package com.heidan.interview;

public class StringPool58Demo {
    //运行时常量池是方法区的一部分，JDK8中完全使用元空间来代替永久代
    //String:intern()是一个本地方法，它的作用是如果字符串常量池中已经包含一个等于此String对象的字符串，则返回代表池中这个字符串的
    //String对象的引用；否则，会将此String对象包含的字符串添加到常量池中，并且返回此String对象的引用。
    public static void main(String[] args) {
        String str1 = new StringBuilder("58").append("tongcheng").toString();
        System.out.println(str1);
        System.out.println(str1.intern());
        System.out.println(str1 == str1.intern());//true

        System.out.println();

        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2);
        System.out.println(str2.intern());//有一个初始化的java字符串(JDK出娘胎自带的)，在加载sun.misc.Version这个类的时候进入常量池
        System.out.println(str2 == str2.intern());//false
    }
}
