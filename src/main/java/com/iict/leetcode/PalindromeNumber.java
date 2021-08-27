package com.iict.leetcode;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(923454329));
    }

    //    public static boolean isPalindrome(int x) {
//        String s = String.valueOf(x);
//        String reverseString = new StringBuilder(s).reverse().toString();
//        return s.equals(reverseString);
//    }
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int y = x, z = 0;
        while (y != 0) {
//            System.out.println("z before: "+ z);
            z += z * 9 + y % 10;
//            System.out.println("z after: "+ z);
//            System.out.println("y before: "+ y);
            y /= 10;
//            System.out.println("y after: "+ y);
        }
        return x == z;
    }
}
