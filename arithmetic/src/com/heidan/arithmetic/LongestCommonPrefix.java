package com.heidan.arithmetic;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = new String[]{"heidan1","heidan2","heidan3"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs){
        if (strs.length == 0){
            return "";
        }
        String str = strs[0];
        for (int i=1;i<strs.length;i++){
            while (strs[i].indexOf(str)!=0){
                str = str.substring(0,str.length()-1);//包含0，不包含str.length()-1
            }
        }
        return str;
    }
}
