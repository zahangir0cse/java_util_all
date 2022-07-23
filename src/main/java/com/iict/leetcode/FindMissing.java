package com.iict.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindMissing {
    public static int findMissingNumber(List<Integer> inputs){
        int sumOfElements = 0;
        for(int input: inputs){
            sumOfElements += input;
        }
        int n = inputs.size() + 1; // Exactly 1 number missing.
        int actualSum = (n * (n + 1))/2;
        return actualSum - sumOfElements;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        System.out.println(findMissingNumber(nums));
    }
}
