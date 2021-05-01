package com.heidan.datastructure;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,25,35,6,5,78};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    //时间复杂度：O(NlogN)
    public static void quickSort(int[] arr,int start,int end){
        if (start<end){
            int standard = arr[start];
            int low = start;
            int high = end;
            while (low<high){
                while (low<high && standard<arr[high]){
                    high--;
                }
                arr[low] = arr[high];
                while (low<high && standard>=arr[low]){
                    low++;
                }
                arr[high] = arr[low];
            }
            arr[low] = standard;
            quickSort(arr,start,low);
            quickSort(arr,low+1,end);
        }
    }
}
