package com.heidan.test01;

public class Test01 {
    public static void main(String[] args) {
        MyClass myClass = MyClass.getMyClass();
        System.out.println(myClass);
    }
}

class MyClass{
    static int num1 = 100;
    static MyClass myClass = new MyClass();

    public MyClass(){
        num1 = 200;
        num2 = 200;
    }
    static int num2 = 100;
    public static MyClass getMyClass(){
        return myClass;
    }

    @Override
    public String toString() {
        return this.num1 + "\t" + this.num2;
    }
}

