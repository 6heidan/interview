package com.heidan.exception;

public class ExceptionTest {
    public static void main(String[] args) {
        System.out.println("关闭了虚拟机");
        System.exit(0);
        try {
            String s = "红";//只能是红黄蓝
            if (!s.equals("红") || s.equals("黄") || s.equals("蓝")){
                throw new MyException("只能是红黄蓝");
            }
            System.out.println("ok....");
        }catch (MyException e){
            System.out.println("出错");
        }finally {
            System.out.println("一定会执行");
        }

    }
}
