package com.heidan.arithmetic;

public class Step03 {
    public int f(int n){
        if (n<1){
            throw new IllegalArgumentException("n不能小于1");
        }
        if (n==1 || n==2){
            return n;
        }
        int f = 1;
        int g = 1;
        return 0;
    }
}
