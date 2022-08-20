package com.iict.leetcode;

public class ValidPalindrom {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static boolean isPalindrome(String s) {
        if(s == null || s.trim() == ""){
            return true;
        }
        s = s.replaceAll("[^A-Za-z0-9]", "");
        s = s.replaceAll(" ", "");
        s = s.toLowerCase();
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        return s.equals(sb.toString());
    }
}
