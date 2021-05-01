package com.heidan.datastructure;

import java.util.Arrays;

/**
 * 时间复杂度：O(n^2)
 * 空间复杂度：O(1)
 * 选择排序是不稳定排序
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {15,35,5,95,75};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectSort(int[] arr){
        for (int i=0;i<arr.length;i++){
            int minIndex = i;
            int min = arr[i];
            for (int j=i+1;j<arr.length;j++){
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
