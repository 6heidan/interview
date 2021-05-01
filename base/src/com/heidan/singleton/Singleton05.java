package com.heidan.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Singleton05 {
    private static volatile Singleton05 singleton05;
    private static boolean heidan = false;
    private Singleton05(){
        synchronized (Singleton05.class){
            if (heidan==false){
                heidan = true;
            }else {
                throw new RuntimeException("不要试图使用反射破坏单例");
            }
        }
    }

    public static Singleton05 getInstance(){
        if (singleton05==null){
            synchronized (Singleton05.class){
                if (singleton05==null){
                    singleton05 = new Singleton05();
                }
            }
        }
        return singleton05;
    }

    //反射
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
//        Singleton05 instance = Singleton05.getInstance();
        Field heidan = Singleton05.class.getDeclaredField("heidan");
        heidan.setAccessible(true);

        Constructor<Singleton05> declaredConstructor = Singleton05.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        Singleton05 instance = declaredConstructor.newInstance();
        heidan.set(instance,false);
        Singleton05 instance2 = declaredConstructor.newInstance();
        System.out.println(instance);
        System.out.println(instance2);
        
    }

}
