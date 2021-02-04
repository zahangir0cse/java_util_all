package com.iict.leetcode;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(3838));
    }
    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        String reverseString = new StringBuilder(s).reverse().toString();
        return s.equals(reverseString);
    }
}
