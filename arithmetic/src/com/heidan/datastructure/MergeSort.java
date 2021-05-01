package com.heidan.datastructure;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {25,65,75,95,85};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    //稳定，采用分治法
    public static void mergeSort(int[] arr,int low,int high){
        int middle = (low+high)/2;
        if (low<high){
            //处理左边
            mergeSort(arr,low,middle);
            //处理右边
            mergeSort(arr,middle+1,high);
            //归并
            merge(arr,low,middle,high);
        }
    }

    public static void merge(int[] arr,int low,int middle,int high){
        //用于存储归并后的临时数组
        int[] temp = new int[high-low+1];
        int index = 0;
        int i = low;
        int j = middle+1;
        while (i<=middle && j<=high){
            if (arr[i]<=arr[j]){
                temp[index] = arr[i];
                i++;
            }else {
                temp[index] = arr[j];
                j++;
            }
            index++;
        }
        while (j<=high){
            temp[index] = arr[j];
            j++;
            index++;
        }
        while (i<=middle){
            temp[index] = arr[i];
            i++;
            index++;
        }
        for (int k = 0;k<temp.length;k++){
            arr[k+low] = temp[k];
        }
    }
}
