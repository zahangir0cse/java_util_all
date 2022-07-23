package com.iict.leetcode;

import java.util.HashSet;
import java.util.Set;

public class FindSum {
    public static boolean findSumOfTwo(int [] a, int val){
        Set<Integer> foundValues = new HashSet<>();
        for(int input: a){
            if(foundValues.contains(val - input)){
                return true;
            }
            foundValues.add(input);
        }
        return false;
    }
}
