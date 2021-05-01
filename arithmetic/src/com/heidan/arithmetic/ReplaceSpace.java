package com.heidan.arithmetic;

public class ReplaceSpace {
    public static void main(String[] args) {
        System.out.println(replaceSpace2(new StringBuffer("We Are Happy")));
    }

    public static String replaceSpace(StringBuffer str){
        StringBuffer result = new StringBuffer();
        for (int i=0;i<str.length();i++){
            char b = str.charAt(i);
            if (String.valueOf(b).equals(" ")){
                result.append("%20");
            }else {
                result.append(b);
            }
        }
        return result.toString();
    }

    public static String replaceSpace2(StringBuffer str){
        return str.toString().replaceAll("\\s","%20");
    }

}
