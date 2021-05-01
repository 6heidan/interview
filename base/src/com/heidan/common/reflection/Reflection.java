package com.heidan.common.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        //1、以class对象为基础
        Class<?> clazz = Class.forName("com.heidan.common.reflection.Student");
        System.out.println(clazz);
        //2、类中每一部分，都有对应的类与之匹配
        //表示属性的属性
        Field nameField = clazz.getField("name");
        //表示方法的类

        Method helloMethod = clazz.getDeclaredMethod("hello", String.class);
        //表示构造方法的类
        Constructor<?>constructor = clazz.getConstructor();

    }
}
