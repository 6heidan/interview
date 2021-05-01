package com.heidan.demo.test;

public class Test04 {
    public static void main(String[] args) {
        hello();
    }

    public static int hello(){
        try {
            int a = 1/0;
            return 1;
        }catch (Exception e){
            return 2;
        }finally {
            return 3;
        }
    }
}
