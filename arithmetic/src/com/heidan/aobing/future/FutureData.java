package com.heidan.aobing.future;

public class FutureData implements Data {
    //内部需要维护RealData
    protected RealData realData = null;
    protected boolean isReady = false;
    public synchronized void setRealData(RealData realData){
        if (isReady){
            return;
        }
        this.realData = realData;
        isReady = true;
        //RealData已经被注入，通知getResult()
        notifyAll();
    }
    @Override
    public synchronized String getResult() {
        while (!isReady){
            try {
                //一直等待，直到RealData被注入
                wait();
            }catch (Exception e){

            }
        }
        return realData.result;
    }
}
