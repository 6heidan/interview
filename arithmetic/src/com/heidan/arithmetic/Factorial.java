package com.heidan.arithmetic;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(getResult(5));
    }

    public static int getResult(int n){
        if (n<0){
            throw new RuntimeException("非法参数");
        }
        if (n==1 || n==0){
            return 1;
        }
        return getResult(n-1)*n;
    }
}
