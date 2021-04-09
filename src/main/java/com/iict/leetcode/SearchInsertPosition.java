package com.iict.leetcode;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int [] nums = {1,3, 5};
        System.out.println(searchInsert(nums, 4));
    }
    public static int searchInsert(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        if(nums[0] > target){
            return 0;
        }
        if(nums[nums.length - 1] < target){
            return nums.length;
        }
        return binarySearch(nums, 0, nums.length - 1, target);

    }

    private static int binarySearch(int [] nums, int firstIndex, int lastIndex, int target){
        while(firstIndex <= lastIndex){
            int midIndex = (firstIndex + lastIndex)/2;
            if (nums[midIndex] == target) {
                return midIndex;
            }
            if ((nums[midIndex] > target)) {
                lastIndex = midIndex - 1;
            } else {
                firstIndex = midIndex + 1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            final int i1 = i + 1;
            if(i1 != nums.length && nums[i] < target && nums[i1] > target){
                return i1;
            }
        }
        return 0;
    }
}
