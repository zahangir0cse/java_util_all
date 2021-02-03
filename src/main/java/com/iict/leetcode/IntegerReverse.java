package com.iict.leetcode;

public class IntegerReverse {
    public static void main(String[] args) {
        System.out.println(reverse(1234));
    }
    public static int reverse(int inputNum){
        int reverse = 0;
        while (inputNum != 0){
            int reminder = inputNum % 10;
            inputNum /= 10;
            if(reverse > Integer.MAX_VALUE/10 || (reverse == Integer.MAX_VALUE/10 && reminder >7)){
                return 0;
            }
            if(reverse < Integer.MIN_VALUE/10 || (reverse == Integer.MIN_VALUE/10 && reminder <-8)){
                return 0;
            }
            reverse = reverse * 10 + reminder;
        }
        return reverse;
    }
}
