package com.iict.leetcode;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntConsumer;

public class FizzBuzz {
    private int n;
    private AtomicInteger i = new AtomicInteger(0);
    private AtomicInteger stage = new AtomicInteger(0);

    public FizzBuzz(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        while (i.get() <= n) {
            if (stage.get() == 1)  {
                printFizz.run();
                stage.set(0);
            }
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        while (i.get() <= n) {
            if (stage.get() == 2)  {
                printBuzz.run();
                stage.set(0);
            }
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while (i.get() <= n) {
            if (stage.get() == 3)  {
                printFizzBuzz.run();
                stage.set(0);
            }
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        while (i.get() < n+1) {
            if (stage.get() == 0) {
                i.incrementAndGet();
                if (i.get() % 3 == 0 && i.get() % 5 != 0) {
                    stage.set(1);
                } else if (i.get() % 5 == 0 && i.get() % 3 != 0) {
                    stage.set(2);
                } else if (i.get() % 3 == 0 && i.get() % 5 == 0) {
                    stage.set(3);
                } else if (i.get() <= n) {
                    printNumber.accept(i.get());
                }
            }
        }
    }
}