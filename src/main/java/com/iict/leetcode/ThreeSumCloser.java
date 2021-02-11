package com.iict.leetcode;

import java.util.Arrays;

public class ThreeSumCloser {
    public static void main(String[] args) {

    }
    public static int threeSumClosest(int[] nums, int target) {
        if(nums == null || nums.length <3){
            return 0;
        }
        Arrays.sort(nums);
        int sum = nums[0] + nums[1] + nums[2];
        for(int i = 0; i<nums.length -2; i++){
            int low = i + 1, high = nums.length - 1;
            int tempSum = 0;
            while(low < high){
                tempSum = nums[i] + nums[low] + nums[high];
                if(tempSum > target){
                    high --;
                }else{
                    low ++;
                }
                if(Math.abs(sum - target) > Math.abs(tempSum -target)){
                    sum = tempSum;
                }
            }
        }
        return sum;
    }
}
