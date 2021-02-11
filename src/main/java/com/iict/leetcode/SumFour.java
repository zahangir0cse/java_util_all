package com.iict.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumFour {
    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        System.out.println(fourSum(nums, target));
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length < 4){
            return result;
        }
        Arrays.sort(nums);
        if(nums.length == 4 && (nums[0] + nums[1] + nums[2] + nums[3]) == target){
            List<Integer> numList = new ArrayList<>();
            numList.add(nums[0]);
            numList.add(nums[1]);
            numList.add(nums[2]);
            numList.add(nums[3]);
            result.add(numList);
            return result;
        }
        if(nums.length == 4){
            return result;
        }
        for(int i = 0; i < nums.length; ++i){
            for(int j = i+1; j < nums.length; ++j){
                int left = j+1;
                int right = nums.length -1;
                while(left <right){
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if(sum < target){
                        left ++;
                    }else if(sum > target){
                        right --;
                    }else{
                        List<Integer> numList = new ArrayList<>();
                        numList.add(nums[i]);
                        numList.add(nums[j]);
                        numList.add(nums[left]);
                        numList.add(nums[right]);
                        result.add(numList);
                        int leftVal = nums[left];
                        while(left<nums.length -1 && nums[left] == leftVal){
                            left ++;
                        }
                        int rightVal = nums[right];
                        while(left<right && nums[right] == rightVal){
                            right --;
                        }
                    }
                }
                while(j+1 <nums.length && nums[j+1] == nums[j]){
                    j++;
                }
            }
            while(i+1 <nums.length && nums[i+1] == nums[i]){
                i++;
            }
        }
        return result;
    }
}
