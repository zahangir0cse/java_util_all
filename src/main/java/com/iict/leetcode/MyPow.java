package com.iict.leetcode;

public class MyPow {
    public static void main(String[] args) {
        System.out.println(myPow(1.00000, -2147483648));
    }
    public static double myPow(double x, int n) {
        return recursiveFastPow(x, n);
    }

    private static double recursiveFastPow(double x, long n){
        if(n == 0){
            return 1.0;
        }
        if(n == 1){
            return x;
        }
        if(x == 1.0){
            return x;
        }
        if(n < 0){
            n = (-1) * n;
            return recursiveFastPow(1/x, n);
        }
        if(n%2 == 0){
            double result = recursiveFastPow(x, n/2);
            return result * result;
        }
        return x * recursiveFastPow(x, n -1);
    }
}
