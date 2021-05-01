package com.heidan.JUC.fourfunctionalinterface;

import java.util.function.Supplier;

/**
 * 供给型接口：没有参数，只有返回值
 */
public class SupplierDemo {
    public static void main(String[] args) {
//        Supplier supplier = new Supplier() {
//            @Override
//            public Object get() {
//                System.out.println("get()");
//                return 1024;
//            }
//        };

        Supplier supplier = () -> {return 1024;};
        System.out.println(supplier.get());
    }
}
