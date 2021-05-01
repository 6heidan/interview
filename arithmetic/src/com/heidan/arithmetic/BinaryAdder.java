package com.heidan.arithmetic;

public class BinaryAdder {
    public static void main(String[] args) {
        BinaryAdder binaryAdder = new BinaryAdder();
        System.out.println(binaryAdder.sum(5, 6));
    }

    //  ^：按位异或（二进制）：表示不进位加法
    //位运算表示不进位加法：一个异或操作
    //位运算表示进位加法：一个与操作左移一位
    public int sum(int a,int b){
        if (b==0){
            return a;
        }
        return sum(a^b,(a&b)<<1);
    }
}
