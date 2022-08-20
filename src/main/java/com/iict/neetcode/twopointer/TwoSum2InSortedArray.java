package com.iict.neetcode.twopointer;

public class TwoSum2InSortedArray {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length -1;
        int [] result = new int[2];
        while (left < right){
            if(numbers[left] + numbers[right] > target){
                right --;
            }else if(numbers[left] + numbers[right] < target){
                left ++;
            }else {
                result[0] = left +1;
                result[1] = right +1;
                return result;
            }
        }
        return result;
    }
}
