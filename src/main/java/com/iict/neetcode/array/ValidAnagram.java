package com.iict.neetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
//    public boolean isAnagram(String s, String t) {
//        if(s.length() != t.length()){
//            return false;
//        }
//        Map<Character, Integer> sMap = new HashMap<>();
//        Map<Character, Integer> tMap = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0)+1);
//            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0)+1);
//        }
//        return sMap.equals(tMap);
//    }
    public boolean isAnagram(String s, String t) {
        char[] sCharArr = s.toCharArray();
        char[] tCharArr = t.toCharArray();

        Arrays.sort(sCharArr);
        Arrays.sort(tCharArr);
        return Arrays.equals(tCharArr, sCharArr);
    }

}
