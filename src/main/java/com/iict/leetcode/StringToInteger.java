package com.iict.leetcode;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class StringToInteger {
    public static void main(String[] args) {
        System.out.println(myAtoi("21474836460 with words"));
    }
    public static int myAtoi(String s) {
        if(s == null || s.equals("")){
            return 0;
        }
        s = s.trim();
        List<StringBuilder> numberCharList = new ArrayList<>();
        if(s.length() == 1){
            if(Character.isDigit(s.charAt(0))){
                return Integer.parseInt(s);
            }
            return 0;
        }
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i<s.length(); i++){
            if(i == 0){
                if(!Character.isDigit(s.charAt(i))){
                    if(!(s.charAt(i) == '+' || s.charAt(i)=='-')){
                        break;
                    }else {
                        if(!Character.isDigit(s.charAt(1))){
                            break;
                        }else {
                            numberCharList.add(sb.append(s.charAt(0))) ;
                        }
                    }
                }else {
                    numberCharList.add(sb.append(s.charAt(0))) ;
                }
            }
            if(i != 0){
                if(!Character.isDigit(s.charAt(i))){
                    break;
                }
                numberCharList.add(sb.append(s.charAt(i)));
            }
        }
        int returnInt = 0;
        BigInteger retBigInt = null;
        if(!sb.toString().equals("")){
            try {
                returnInt = Integer.parseInt(sb.toString());
            }catch (Exception e){
                retBigInt = new BigInteger(sb.toString());
            }
        }
        if(retBigInt == null){
            return returnInt;
        }
        if(retBigInt.compareTo(new BigInteger(String.valueOf(Integer.MIN_VALUE))) < 0){
            return Integer.MIN_VALUE;
        }
        return Integer.MAX_VALUE;

    }
}
