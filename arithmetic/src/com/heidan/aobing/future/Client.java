package com.heidan.aobing.future;

public class Client {
    //这是一个异步方法，返回的Data接口是一个Future
    public Data request(final String queryStr){
        final FutureData futureData = new FutureData();
        new Thread(){
            @Override
            public void run() {
                //RealData的构造很慢，所以在单独的线程中进行
                RealData realData = new RealData(queryStr);
                //setRealData的时候会notify()等待在这个future上的对象
                futureData.setRealData(realData);
            }
        }.start();
        //FutureData会被立即返回，不会等待RealData被构造完
        return futureData;
    }
}
