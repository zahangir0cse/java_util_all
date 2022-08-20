package com.iict.neetcode.array;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int [] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = nums[i] * result[i-1];
        }
        int product = 1;
        for (int i = nums.length - 1; i >0 ; i--) {
            result[i] = result[i-1] * product;
            product = product * nums[i];
        }
        result[0] = product;
        return result;
    }
}
