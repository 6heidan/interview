package com.heidan.demo.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ST {
    public static void main(String[] args) {
        int[] arr = {5,9,7,3,4};
        for (int min=0,max=arr.length-1;min<max;min++,max--){
            int temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
