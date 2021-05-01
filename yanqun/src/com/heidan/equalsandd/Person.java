package com.heidan.equalsandd;

import java.util.Objects;

public class Person {
    private int age;
    private String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //约定：如果name和age相同，则返回true
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj instanceof Person){
            Person per = (Person) obj;
            //用传入的per，和当前对象this比较
            if (this.name.equals(per.getName()) && this.age==per.getAge()){
                return true;
            }
        }
        return false;
    }

    //hashCode和equals()的重写逻辑一致
    @Override
    public int hashCode() {
        return name.hashCode() & age;
    }
}
