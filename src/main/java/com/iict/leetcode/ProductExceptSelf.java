package com.iict.leetcode;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4};
        System.out.println(productExceptSelf(nums));
    }
    public static int[] productExceptSelf(int[] nums) {
        int output[] = new int[nums.length];
        int product = 1;
        output[0] = nums[0];
        for(int i=1; i<nums.length;i++) {
            output[i] = output[i-1]*nums[i];
        }
        for(int i=nums.length-1; i>0; i--) {
            output[i] = output[i-1]*product;
            product = product * nums[i];
        }
        output[0] = product;

        return output;
    }
}
