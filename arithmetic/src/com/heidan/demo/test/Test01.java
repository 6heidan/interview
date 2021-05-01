package com.heidan.demo.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Queue;

public class Test01 {
    public static void main(String[] args) {
        int[] arr = {56,35,85,45,99};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] arr){
        for (int i = 1 ; i < arr.length; i++) {
            if (arr[i]<arr[i-1]){
                int temp = arr[i];
                int j;
                for (j=i-1;j>=0 && temp<arr[j];j--){
                    arr[j+1] = arr[j];
                }
                arr[j+1] = temp;
            }
        }
    }

    public static void selectSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            int min = arr[i];
            for (int j = i+1;j<arr.length;j++){
                if (min>arr[j]){
                    minIndex = j;
                    min = arr[j];
                }
            }
            if (minIndex!=i){
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }
    }
}
