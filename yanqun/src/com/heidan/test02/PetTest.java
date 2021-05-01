package com.heidan.test02;

public class PetTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Penguin penguin = new Penguin();

        Pet pet = Master.getPet(1);
        if (pet instanceof Dog){
            Dog dog1 = (Dog) pet;
        }else {
            Penguin penguin1 = (Penguin) pet;
        }
    }
}
