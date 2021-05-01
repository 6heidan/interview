package com.heidan.fqy;

public class Fibonacci {
    public static void main(String[] args) {

    }

    public static int getFibonacci(int n){
        if (n<0){
            return -1;
        }
        if (n==1 || n==2){
            return 1;
        }else {
            return getFibonacci(n-1) + getFibonacci(n-2);
        }
    }
}
