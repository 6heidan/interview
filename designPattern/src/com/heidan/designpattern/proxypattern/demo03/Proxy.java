package com.heidan.designpattern.proxypattern.demo03;

public class Proxy implements Subject {
    //要代理哪个实现类
    private Subject subject = null;
    //默认被代理者
    public Proxy(){
        this.subject = new Proxy();
    }
    //通过构造函数传递代理者
    public Proxy(Object...objects){

    }
    //预处理
    private void before(){
        //do something
    }
    //善后处理
    private void after(){
        //do something
    }
    //实现接口中定义的方法
    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }
}
