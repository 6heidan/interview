package com.heidan.arithmetic;

public class Fibonacci {
    public static void main(String[] args) {
        //斐波那契数列：1  1   2   3   5   8   13
        int fibonacci = fibonacci(6);
        System.out.println(fibonacci);

        //0 1 1 2 3 5 8 13 21
        System.out.println(fibonacci2(6));
    }

    //打印第n项斐波那契数列
    public static int fibonacci(int i){
        if (i==1 || i==2){
            return i;
        }else {
            return fibonacci(i-1) + fibonacci(i-2);
        }
    }

    public static int fibonacci2(int n){
        if (n<=1){
            return n;
        }
        int first = 0;
        int second = 1;
        for (int i=0;i<n-1;i++){
            int sum = first+second;
            first = second;
            second = sum;
        }
        return second;
    }


}
