package com.iict.leetcode;

public class MaxArea {
    public static void main(String[] args) {

    }
    public static int maxArea(int[] height) {
        if(height.length == 0){
            return 0;
        }
        if(height.length == 1){
            return height[0];
        }
        int maxArea = 0;
        for(int i = 0; i <height.length;  i++){
            for(int j =i+ 1; j <height.length; j++){
                maxArea = Math.max(maxArea, Math.min(height[i], height[j]) * (j - i));
            }
        }
        return maxArea;
    }

    public int maxArea2(int[] height) {
        if(height.length == 0){
            return 0;
        }
        if(height.length == 1){
            return height[0];
        }
        int maxArea = 0, leftIndex = 0, rightIndex = height.length - 1;
        while(leftIndex < rightIndex){
            maxArea = Math.max(maxArea, Math.min(height[leftIndex], height[rightIndex]) * (rightIndex - leftIndex));
            if(height[leftIndex] < height[rightIndex]){
                leftIndex ++;
            }else{
                rightIndex --;
            }
        }
        return maxArea;
    }
}
