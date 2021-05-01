package com.heidan.singleton;

public enum  Singleton06 {
    INSTANCE;

    public Singleton06 getInstance(){
        return INSTANCE;
    }
}

class Test{
    public static void main(String[] args) {
        Singleton06 instance = Singleton06.INSTANCE;
        Singleton06 instance2 = Singleton06.INSTANCE;
        System.out.println(instance);
        System.out.println(instance2);
    }
}
