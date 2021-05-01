package com.heidan.test02;

public class Master {
    public static Pet getPet(int typeId){
        Pet pet = null;
        if (typeId==1){
            pet = new Dog();
        }else {
            pet = new Penguin();
        }
        return pet;
    }
}
