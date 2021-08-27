package com.iict.leetcode;

public class FloorNumber {
    public static void main(String[] args) {
        System.out.println(round(24));
        System.out.println(round(25));
        System.out.println(round(27));
        System.out.println(round(50));
        System.out.println(round(51));
        System.out.println(round(74));
        System.out.println(round(75));
        System.out.println(round(100));
        System.out.println(round(101));
        System.out.println(round(2045));
        System.out.println(round(2057));
        System.out.println(round(2078));
        System.out.println(round(20789));
        System.out.println(round(207));
        System.out.println(round(20757));
        System.out.println(round(20775));
    }

    public static int round(int original) {
        if (original <= 100) {
            if (original >= 75) {
                return 100;
            }
            if (original >= 50) {
                return 50;
            }
            if (original >= 25) {
                return 50;
            }
            return 0;
        }
        int reminder = original % 100;
        if (reminder < 25) {
            return original - reminder;
        }
        if (reminder < 74) {
            return (original - reminder) + 50;
        }
        return (original - reminder) + 100;
    }


    public static int roundNegative(int original) {
        if (original % 10 <= 2) {
            return original - (original % 10);
        }
        if (original % 10 <= 7) {
            return original - (original % 10) + 5;
        }
        if (original % 10 <= 9) {
            return original - (original % 10) + 10;
        }
        if (original % 10 >= -2) {
            return original - (original % 10);
        }
        if (original % 10 >= -7) {
            return original - (original % 10) - 5;
        }
        return original - (original % 10) - 10;
    }
}
