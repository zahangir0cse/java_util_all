package com.iict.concurrency;

class Counter{
    int num;

    public synchronized void increase(){
        num++;
    }
}

public class SyncronizationMain {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
//        counter.increase();
//        counter.increase();
//        counter.increase();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increase();//1000
            }

        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {//2000
                counter.increase();
            }

        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(counter.num);
    }
}
