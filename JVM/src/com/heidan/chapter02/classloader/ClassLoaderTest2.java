package com.heidan.chapter02.classloader;

public class ClassLoaderTest2 {
    public static void main(String[] args) {
        ClassLoader classLoader = null;
        try {
            //1
            classLoader = Class.forName("java.lang.String").getClassLoader();
            System.out.println(classLoader);

            //2
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            System.out.println(contextClassLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2
            
            //3
            ClassLoader extClassLoader = ClassLoader.getSystemClassLoader().getParent();
            System.out.println(extClassLoader);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
