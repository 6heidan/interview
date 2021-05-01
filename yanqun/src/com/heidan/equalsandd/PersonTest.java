package com.heidan.equalsandd;

import java.util.HashMap;
import java.util.Map;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person(23,"zs");
        Person person2 = new Person(23,"zs");
        System.out.println(person1.equals(person2));

        Map<Person,String> map = new HashMap<>();
        map.put(person1,"AAA");
        map.put(person2,"BBB");
        System.out.println(map.get(person1));
        System.out.println(map.get(person2));

    }
}
