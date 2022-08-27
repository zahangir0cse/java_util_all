package com.iict.neetcode.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        if(s.length() == 1){
            return 1;
        }
        int left = 0, result = 0;
        Set<Character> set = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            while (!set.add(currentChar)){
                set.remove(s.charAt(left));
                left++;
            }
            result = Math.max(result, right - left + 1);
        }
        return result;
    }
}
