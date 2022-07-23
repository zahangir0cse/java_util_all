package com.iict.thread.basic;

public class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        /*synchronized (this){
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " i = " + i);
            }
        }*/
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " i = " + i);
        }
    }
}
