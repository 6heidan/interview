package com.heidan.datastructure;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3,5,2,7,81,56,75,3,0,58};
        System.out.println(Arrays.toString(arr));
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //时间复杂度：最坏O(n^2)  最好：O(n^1.3)    空间复杂度：O(1)
    //希尔排序是直接插入排序的升级版，希尔排序是不稳定排序
    public static void shellSort(int[] arr){
        int k = 1;
        for (int d=arr.length/2; d>0; d/=2){
            for (int i=d; i<arr.length; i++){
                for (int j=i-d; j>=0; j-=d){
                    if (arr[j] > arr[j+d]){
                        int temp = arr[j];
                        arr[j] = arr[j+d];
                        arr[j+d] = temp;
                    }
                }
            }
            System.out.println("第"+k+"次排序结果："+ Arrays.toString(arr));
            k++;
        }
    }

}
