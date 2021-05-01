package com.heidan.fqy;

public class BubbleSort {
    public static void main(String[] args) {

    }

    public static void bubbleSort(int[] arr){
        //冒泡排序共需要比较n-1轮
        for (int i = 0; i < arr.length; i++) {
            //是否可以提交退出冒泡的标记
            boolean flag = false;
            //相邻之间两两比较，并且每次减少一位参与比较
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    //有数据交换，不能提前退出
                    flag = true;
                }
            }
            if (!flag){
                break;//没有数据交换，提前退出冒泡排序
            }
        }
    }
}
