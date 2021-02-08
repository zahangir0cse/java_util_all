package com.iict.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubString {

    public static void main(String[] args) {
//        System.out.println(lengthOfLongestSubString("abcdafd"));
        System.out.println(getUniqueCharacterSubstring("abcdafd"));
    }
    public static int lengthOfLongestSubString(String s){
        if(s == null || s.equals("")){
            return 0;
        }
        int stringLength = s.length();
        if(stringLength == 1){
            return 1;
        }
        /*int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int j = 0, i = 0; j < stringLength; j++) {
            if(map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i +1);
            map.put(s.charAt(j), j+1);
        }*/
        return getUniqueCharacterSubstring(s).length();
    }

    private static String getUniqueCharacterSubstring(String input) {//abcdafd
        Map<Character, Integer> visited = new HashMap<>();
        String output = "";
        Character currentChar = null;
        for (int start = 0, end = 0; end < input.length(); end++) {
            currentChar = input.charAt(end); //a
            if (visited.containsKey(currentChar)) {//false
                start = Math.max(visited.get(currentChar)+1, start);//1
            }
            if (output.length() < end - start + 1) {//
                output = input.substring(start, end + 1);
            }
            visited.put(currentChar, end);
        }
        return output;
    }
}
