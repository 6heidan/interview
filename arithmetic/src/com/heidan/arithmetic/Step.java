package com.heidan.arithmetic;

public class Step {
    public static void main(String[] args) {
        System.out.println(f(500));
    }

    public static int f(int n){
        if (n<1){
            throw new IllegalArgumentException("n不能小于1");
        }
        if (n==1 || n==2){
            return n;
        }
        return f(n-1) + f(n-2);
    }
}
