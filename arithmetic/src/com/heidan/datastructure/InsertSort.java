package com.heidan.datastructure;

import java.util.Arrays;

/**
 * 时间复杂度：最好的情况：O(n)       最坏的情况：O(n^2)
 * 空间复杂度：O(1)
 * 稳定性分析：关键词相同的数据元素将保持原有位置不变，所以该算法是稳定的
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {58,65,95,35};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] arr){
        for (int i=1;i<arr.length;i++){
            if (arr[i]<arr[i-1]){
                int temp = arr[i];
                int j;
                for (j=i-1; j>=0 && temp<arr[j]; j--){
                    //把前一个数字赋给后一个数字
                    arr[j+1] = arr[j];
                }
                //把临时变量（外层for循环的当前元素）赋给不满足条件的后一个元素
                arr[j+1] = temp;
            }
        }
    }
}
