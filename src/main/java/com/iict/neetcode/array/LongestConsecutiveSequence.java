package com.iict.neetcode.array;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int longest = 0;
        for(int num: set){
            if(!set.contains(num - 1)){
                int currentNum = num;
                int currentCount = 1;
                while (set.contains(currentNum + 1)){
                    currentCount++;
                    currentNum++;
                }
                longest = Math.max(longest, currentCount);
            }
        }
        return longest;
    }
}
