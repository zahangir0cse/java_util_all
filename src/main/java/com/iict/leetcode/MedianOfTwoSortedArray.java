package com.iict.leetcode;

public class MedianOfTwoSortedArray {
    public static float calculateMedian(int [] leftArray, int [] rightArray){
        int [] mergedArray = getMergedArray(leftArray, rightArray);
        int mergedArrayLength = mergedArray.length;
        if(mergedArrayLength % 2 == 0){
            return (float) (mergedArray[mergedArrayLength/2] + mergedArray[(mergedArrayLength/2) - 1])/2;
        }
        return (float) mergedArray[mergedArrayLength/2];
    }
    public static int[] getMergedArray(int [] leftArray, int [] rightArray){
        int leftArrayLength = leftArray.length;
        int rightArrayLength = rightArray.length;
        int [] returnArray = new int[leftArrayLength + rightArrayLength];
        int leftIndex = 0, rightIndex = 0, mainIndex = 0;
        while (leftIndex < leftArrayLength && rightIndex < rightArrayLength) {
            if(leftArray[leftIndex] <= rightArray[rightIndex]){
                returnArray[mainIndex++] = leftArray[leftIndex++];
            }else {
                returnArray[mainIndex++] = rightArray[rightIndex++];
            }
        }
        while (leftIndex < leftArrayLength) {
            returnArray[mainIndex++] = leftArray[leftIndex++];
        }
        while (rightIndex< rightArrayLength) {
            returnArray[mainIndex++] = rightArray[rightIndex++];
        }
        return returnArray;
    }
}
