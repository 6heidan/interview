package com.heidan.aobing;

/**
 * 给定两个字符串str1和str2,输出两个字符串的最长公共子串，如果最长公共子串为空，输出-1。
 * 比如："ab123cd"，"a123456c"，
 * 返回："123"，
 * 备注：1≤|str1|,|str2|≤5000
 */
public class LongestCommonSubsequence {

    public static String useDirectIterator(String str1,String str2){
        //方法入口惯例校验入参
        if (str1==null || "".equals(str1) || str2==null || "".equals(str2)){
            return "-1";
        }
        //先将二者转为char数组
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();
        //maxLength是出现的最大公共子串长度
        int maxLength = 0;
        //maxEndIndexInArray1是出现的最大公共子串的最后一个字符在str1的index
        int maxEndIndexInArray1 = 0;
        for (int i = 0; i <charArr1.length; i++) {
            for (int j=0;j<charArr2.length;j++){
                if (charArr1[i]==charArr2[j]){
                    //tempIndex1是迭代charArray1的临时index
                    //tempIndex2是迭代charArray2的临时index
                    //tempMax是本次迭代中的最大子串长度
                    int tempIndex1 = i;
                    int tempIndex2 = j;
                    int tempMax = 0;
                    //务必记得加上下标范围的约束，避免下标越界。
                    //两个index同时向前进直到不相等或者到了字符串最后则终止
                    while (tempIndex1<charArr1.length && tempIndex2<charArr2.length && charArr1[tempIndex1]==charArr2[tempIndex2]){
                        tempMax++;
                        tempIndex1++;
                        tempIndex2++;
                    }
                    if (tempMax>maxLength){
                        maxLength = tempMax;
                        //因为后面substring方法是包头不包尾，这里不用减去1
                        maxEndIndexInArray1 = tempIndex1;
                    }
                }
            }
        }
        if (maxLength==0){
            return "-1";
        }else {
            return str1.substring(maxEndIndexInArray1-maxLength,maxEndIndexInArray1);
        }
    }

    public static void main(String[] args) {
        String s1 = "firsthahahatwo";
        String s2 = "sshahahakjklj";
        System.out.println(useDirectIterator(s1, s2));
    }
}
