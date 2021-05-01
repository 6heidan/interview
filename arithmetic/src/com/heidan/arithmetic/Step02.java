package com.heidan.arithmetic;

import org.junit.Test;

public class Step02 {
    @Test
    public void test(){
        Long start = System.currentTimeMillis();
        System.out.println(poop(5));
        Long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    public static int poop(int n){
        if (n<1){
            throw new IllegalArgumentException(n+"不能小于1");
        }
        if (n==1 || n==2){
            return n;
        }
        int one = 2;
        int two = 1;
        int sum = 0;
        for (int i=3;i<=n;i++){
            sum = two + one;
            two = one;
            one = sum;
        }
        return sum;
    }
}
