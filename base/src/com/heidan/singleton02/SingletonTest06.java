package com.heidan.singleton02;

public class SingletonTest06 {
    public static void main(String[] args) {
        Singleton06 instance = Singleton06.INSTANCE;
        Singleton06 instance1 = Singleton06.INSTANCE;
        System.out.println(instance==instance1);
        instance.sayOk();
    }
}
//枚举不仅可以解决多线程的问题，还可以防止反序列化重新创建新的对象
enum  Singleton06{
    INSTANCE;
    public void sayOk(){
        System.out.println("ok");
    }
}
