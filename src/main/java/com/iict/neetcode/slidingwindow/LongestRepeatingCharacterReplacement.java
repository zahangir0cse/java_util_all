package com.iict.neetcode.slidingwindow;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int result = 0, left = 0;
        int maxCount = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            map.put(s.charAt(right), 1+ map.getOrDefault(s.charAt(right), 0));
            maxCount = Math.max(maxCount, Collections.max(map.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getValue());
            while ((right - left + 1) - maxCount > k){
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
            }
            result = Math.max(result, right - left +1);
        }
        return result;
    }
}
