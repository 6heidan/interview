package com.heidan.arithmetic;

import java.util.Arrays;

public class ArrReverse {
    public static void main(String[] args) {
        int[] arr = {5,6,9,7,6};
        arrReverse(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr2 = {9,6,7,5,4,3};
        arrayReverse(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    public static int[] arrReverse(int[] arr){
        for (int i=0;i<arr.length/2;i++){
            int temp = arr[arr.length-1-i];
            arr[arr.length-1-i] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static int[] arrayReverse(int[] arr){
        for (int min=0,max=arr.length-1;min<max;min++,max--){
            int temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;
        }
        return arr;
    }
}
