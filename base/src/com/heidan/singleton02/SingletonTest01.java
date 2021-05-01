package com.heidan.singleton02;

public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance==instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}
//缺点：在类加载的时候完成实例化，达不到懒加载的效果，很可能造成内存空间的浪费，
class Singleton{
    private final static Singleton instance = new Singleton();
    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }

}
