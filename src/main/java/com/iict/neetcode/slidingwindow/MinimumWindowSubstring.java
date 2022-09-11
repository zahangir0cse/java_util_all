package com.iict.neetcode.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if(t == null || t.length() == 0){
            return "";
        }
        Map<Character, Integer> countT = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        for(char c: t.toCharArray()){
            countT.put(c, 1 + countT.getOrDefault(c, 0));
        }
        int have = 0, need = countT.size();
        int [] result = {-1, -1};
        int left = 0;
        float resultLen = Float.MAX_VALUE;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            window.put(c, 1+window.getOrDefault(c, 0));
            if(countT.containsKey(c) && countT.get(c) == window.get(c)){
                have++;
            }
            while (have == need){
                int windowLen = right - left + 1;
                if(windowLen < resultLen){
                    result = new int[]{left, right};
                    resultLen = windowLen;
                }
                window.put(s.charAt(left), window.get(s.charAt(left)) - 1);
                if(countT.containsKey(s.charAt(left)) && window.get(s.charAt(left)) < countT.get(s.charAt(left))){
                    have--;
                }
                left++;
            }
        }
        return resultLen == Integer.MAX_VALUE?"":s.substring(result[0], result[1]+1);
    }
}
