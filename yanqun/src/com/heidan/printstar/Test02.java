package com.heidan.printstar;

public class Test02 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i=0;i<rows;i++){
            for (int j=0; j<rows-i-1; j++){//空格的个数
                System.out.print(" ");
            }
            for (int j=0; j<2*i+1; j++){
                System.out.print("*");//*的个数
            }
            System.out.println();
        }
    }


}
