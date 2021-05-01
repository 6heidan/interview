package com.heidan.common;

public class Deadlock {
    private static final Object a = new Object();
    private static final Object b = new Object();


    static class Task implements Runnable{
        private boolean flag;
        public Task(boolean flag){
            this.flag = flag;
        }
        @Override
        public void run() {
            if (flag){
                synchronized (a){
                    System.out.println(Thread.currentThread().getName() + "\t获取到a资源");
                    synchronized (b){
                        System.out.println(Thread.currentThread().getName() + "\t获取到b资源");
                    }
                }
            }else {
                synchronized (b){
                    System.out.println(Thread.currentThread().getName() + "\t获取到b资源");
                    synchronized (a){
                        System.out.println(Thread.currentThread().getName() + "\t获取到a资源");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new Task(true)).start();
        new Thread(new Task(false)).start();
    }
}
