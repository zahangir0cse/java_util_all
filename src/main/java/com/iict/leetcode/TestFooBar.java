package com.iict.leetcode;

public class TestFooBar {
    public static void main(String[] args) throws InterruptedException {
        FooBar fooBar = new FooBar(3);
        fooBar.bar(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
}
