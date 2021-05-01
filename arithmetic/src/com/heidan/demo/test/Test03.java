package com.heidan.demo.test;

public class Test03 {
    public static void main(String[] args) {
        Father father = new Son();
        father.method();
        System.out.println(father.name);
    }

}

class Son extends Father{
    String name = "ls";
    @Override
    public void method() {
        System.out.println("son");
    }
}

class Father{
    String name = "zs";
    public void method(){
        System.out.println("father...");
    }
}
