package com.iict.ds;

public class ComplexityTest {

    public int sum(int n) {
        if (n > 1) {
            return  (n* (n + 1)) / 2; //O(1)
        }
        return 0;

    }

    public int sum1(int n) {
        if (n > 1) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                int x = i+1;
                sum =+ i; //O(n)
            }
            return sum;
        }
        return 0;

    }
}
