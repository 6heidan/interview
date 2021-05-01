package com.heidan.datastructure;


import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.assertEquals;

//计数排序
public class CountSort {
    public static void main(String[] args) {

        int[] arr = {2, 4, 2, 3, 7, 1, 1, 0, 0, 5, 6, 9, 8, 5, 7, 4, 0, 9};
        int[] result = sort(arr);
        System.out.println(Arrays.toString(result));
    }

    static int[] sort(int[] arr) {
        int[] result = new int[arr.length];
        int[] count = new int[10];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        System.out.println(Arrays.toString(count));
        for (int i = 0, j = 0; i < count.length; i++) {
            while (count[i]-- > 0) {
                result[j++] = i;
            }
        }
        return result;
    }
}

class CountSortTest{
    int[] generateRandomArray(){
        Random random = new Random();
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);//范围在0~9之间
        }
        return arr;
    }

    @Test
    void testSort(){
        int[] a = generateRandomArray();
        int[] result = CountSort.sort(a);
        Arrays.sort(a);
        boolean same = true;

        for (int i = 0; i < a.length; i++) {
            if (result[i] != a[i]){
                same = false;
            }
        }
        assertEquals(true,same);
    }
}
