package com.iict.thread.basic;

public class MyThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
//            System.out.println(Thread.currentThread().getState().name());
            System.out.println("Runnable " + Thread.currentThread().getName() +  " " + i);
        }
    }
}
