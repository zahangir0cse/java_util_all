package com.iict.neetcode.twopointer;

public class TrappingRainWater {
    public int trap(int[] height) {
        if(height == null || height.length == 0){
            return 0;
        }
        int result = 0, left=0, right = height.length - 1;
        int maxLeft = height[left], maxRight = height[right];
        while (left < right){
            if(maxLeft <= maxRight){
                left++;
                maxLeft = Math.max(maxLeft, height[left]);
                result += Math.max(0, maxLeft - height[left]);
            }else {
                right--;
                maxRight = Math.max(maxRight, height[right]);
                result += Math.max(0, maxRight - height[right]);
            }
        }
        return result;
    }
}
