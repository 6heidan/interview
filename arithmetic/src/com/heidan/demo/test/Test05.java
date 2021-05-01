package com.heidan.demo.test;

import org.junit.Test;

public class Test05 {
    public static void main(String[] args) {
        String str1 = "heidan1";
        String str2 = "i";
        int i = str1.indexOf(str2);
        System.out.println(i);
    }

    @Test
    public void test(){
        String[] arr = {"heidan1","heidan2","heidan3"};
        System.out.println(LongestCommonPrefix(arr));
    }

    public String LongestCommonPrefix(String[] arr){
        if (arr.length==0){
            return "";
        }
        String str = arr[0];
        for (int i=1;i<arr.length;i++){
            while (arr[i].indexOf(str)!=0){
                str = str.substring(0,str.length()-1);
            }
        }
        return str;
    }
}
