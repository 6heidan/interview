package com.heidan.fqy;

import javax.xml.bind.ValidationException;

public class Factorial {
    public static void main(String[] args) throws ValidationException {
        System.out.println(getResult(3));
    }

    public static int getResult(int n) throws ValidationException {
        if (n<0){
            throw new ValidationException("非法参数异常");
        }
        if (n==1 || n==0){
            return 1;
        }
        return getResult(n-1)*n;
    }
}
