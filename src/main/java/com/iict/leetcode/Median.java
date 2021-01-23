package com.iict.leetcode;

public class Median {
    public static void main(String[] args) {
        double median = Solution.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4});
    }
}
class Solution{
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] margeArray = Solution.margeArray(nums1, nums2);
        return Solution.median(margeArray);
    }

    public static int[] margeArray(int [] arr1, int [] arr2){
        int arr1Length = arr1.length;
        int arr2Length = arr2.length;
        int margeArrLength = arr1Length + arr2Length;
        int [] margeArr = new int[margeArrLength];
        int arr1Index, arr2Index, margeArrIndex;
        arr1Index = arr2Index = margeArrIndex = 0;
        while(arr1Index < arr1Length && arr2Index < arr2Length){
            if(arr1[arr1Index] < arr2[arr2Index]){
                margeArr[margeArrIndex++] = arr1[arr1Index++];
            }else{
                margeArr[margeArrIndex++] = arr2[arr2Index++];
            }
        }
        while(arr1Index < arr1Length){
            margeArr[margeArrIndex++] = arr1[arr1Index++];
        }
        while(arr2Index < arr2Length){
            margeArr[margeArrIndex++] = arr2[arr2Index++];
        }
        return margeArr;
    }

    public static double median(int[] arr){
        int arrLength = arr.length;
        boolean isEven = ((arrLength%2) == 0);
        int midIndex = arr.length/2;// 2 3 4 5 6 7
        if(!isEven){
            return arr[midIndex];
        }
        return ((double) arr[midIndex] + (double) arr[midIndex-1])/2;
    }
}