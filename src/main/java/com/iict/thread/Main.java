package com.iict.thread;

import com.iict.thread.basic.MyThread;
import com.iict.thread.basic.MyThread2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread("thread 1");
        System.out.println(t1.getState());
        MyThread t2 = new MyThread("thread 2");
        MyThread2 t3 = new MyThread2();
        Thread t = new Thread(t3);
        Thread t11 = new Thread(t3);
        t1.start();
        Thread.sleep(1000);
//        Thread.State
        System.out.println(t1.getState());
        System.out.println(t1.getState());
        System.out.println(t1.getState());
        System.out.println(t1.getState());
        System.out.println(t1.getState());
        System.out.println(t1.getState());
        System.out.println(t1.getState());
        System.out.println(t1.getState());
        System.out.println(t1.getState());
        System.out.println(t1.getState());
        System.out.println(t1.getState());
        System.out.println(t1.getState());
        System.out.println(t1.getState());
        System.out.println(t1.getState());
        System.out.println(t1.getState());
        System.out.println(t1.getState());
        System.out.println(t1.getState());
        System.out.println(t1.getState());
        System.out.println(t1.getState());
        System.out.println(t1.getState());
        System.out.println(t1.getState());
        System.out.println(t1.getState());
        System.out.println(t1.getState());
        System.out.println(t1.getState());
        System.out.println(t1.getState());
        System.out.println(t1.getState());
        System.out.println(t1.getState());
        t2.start();
        System.out.println(t1.getState());
//        t.setName("Test");
        t.start();
        System.out.println(t1.getState());
        t11.start();
        System.out.println(t1.getState());
        System.out.println(t1.getState());
        System.out.println(t1.getState());
        System.out.println(t1.getState());
        System.out.println(t1.getState());
        System.out.println(t1.getState());
//        t.start();

    }
}
