package com.heidan.arithmetic;

public class BytePrintString {
    public static void main(String[] args) {
        String words = "HELLO张三";
        int bytes = 8;
        String[] strings = strToArray(words);
        print(strings,bytes);
    }

    private static void print(String[] strings, int bytes) {
        int count = 0;//字节数
        String reg = "[\u4e00-\u9fa5]";
        for (int i=0;i<strings.length;i++){
            if (strings[i].matches(reg)){
                count = count+2;
            }else {
                count = count+1;
            }
            if (count <= bytes){
                System.out.print(strings[i]);
            }
        }
    }

    private static String[] strToArray(String words){
        String[] strs = new String[words.length()];
        for (int i=0;i<words.length();i++){
            strs[i] = words.substring(i,i+1);
        }
        return strs;
    }
}
