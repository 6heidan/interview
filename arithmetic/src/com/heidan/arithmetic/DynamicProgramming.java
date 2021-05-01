package com.heidan.arithmetic;

import java.util.HashMap;

/**
 * 走台阶
 */
public class DynamicProgramming {
    //时间复杂度：O(2^n)
    int getClimbingWay1(int n){
        if (n<1){
            return 0;
        }
        if (n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }
        return getClimbingWay1(n-1) + getClimbingWay1(n-2);
    }

    //时间复杂度和空间复杂度都是O(n)
    int getClimbingWay2(int n, HashMap<Integer,Integer> map){
        if (n<1){
            return 0;
        }
        if (n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }
        if (map.containsKey(n)){
            return map.get(n);
        }else {
            int value = getClimbingWay1(n-1) + getClimbingWay1(n-2);
            map.put(n,value);
            return value;
        }
    }

    //时间复杂度：O(n)    空间复杂度：O(1)
    int getClimbingWay3(int n){
        if (n<1){
            return 0;
        }
        if (n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }
        int a = 1;
        int b = 2;
        int temp = 0;
        for (int i=3;i<=n;i++){
            temp = a+b;
            a = b;
            b = temp;
        }
        return temp;
    }
}
