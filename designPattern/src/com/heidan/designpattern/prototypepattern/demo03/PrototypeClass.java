package com.heidan.designpattern.prototypepattern.demo03;

public class PrototypeClass implements Cloneable {
    //覆写父类Object方法

    @Override
    protected PrototypeClass clone() {
        PrototypeClass prototypeClass = null;
        try {
            prototypeClass = (PrototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            //异常处理
        }
        return prototypeClass;
    }
}
