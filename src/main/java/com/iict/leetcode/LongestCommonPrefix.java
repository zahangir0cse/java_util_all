package com.iict.leetcode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String [] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        int minLength = strs[0].length();
        if(minLength == 0){
            return "";
        }
        for(int i = 1; i<strs.length; i++){
            minLength = Math.min(minLength, strs[i].length());
            if(minLength == 0){
                return "";
            }
        }
        int startIndex = 0;
        int endIndex = minLength;
        while(startIndex <= endIndex){
            int midIndex = (startIndex + endIndex)/2;
            if(isCommonPrefix(strs, midIndex)){
                startIndex = midIndex + 1;
            }else{
                endIndex = midIndex -1;
            }
        }
        return strs[0].substring(0, (startIndex + endIndex)/2);

    }

    private static boolean isCommonPrefix(String[] strs, int len){
        String str = strs[0].substring(0, len);
        for(int i = 1; i<strs.length; i++){
            if(!strs[i].startsWith(str)){
                return false;
            }
        }
        return true;
    }
}
