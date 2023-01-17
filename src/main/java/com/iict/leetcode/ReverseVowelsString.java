package com.iict.leetcode;

public class ReverseVowelsString {

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }

    public static String reverseVowels(String s) {
        char [] charArr = s.toCharArray();
        int len = charArr.length - 1;
        int left = 0, right = len;
        while(left <= right){
            while(!isVowel(charArr[left]) && left < right){
                // if(left <= len){
                left ++;
                // }
            }
            while(!isVowel(charArr[right]) && left < right){
                // if(right >= 0){
                right --;
                // }
            }
            char temp = charArr[left];
            charArr[left++] = charArr[right];
            charArr[right--] = temp;
        }
        return new String(charArr);
    }

    private static boolean isVowel(char ch){
        if(ch == 'a'|| ch == 'e' || ch == 'i'||ch == 'o'||ch == 'u'||ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U'){
            return true;
        }
        return false;
    }
}
