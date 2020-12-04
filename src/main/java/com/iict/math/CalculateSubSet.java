package com.iict.math;

import java.util.ArrayList;
import java.util.List;

public class CalculateSubSet {
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        List<int[]> subsetList = new ArrayList<>();
        int numberOfSubSet = (int) Math.pow(Double.parseDouble("2.0"), Double.parseDouble(""+nums.length));
        int [][] subSets = new int[numberOfSubSet][];
//        subSets[numberOfSubSet] =
        for (int i = 0; i < nums.length; i++) {
//            subSets[i] = nums[i];
        }
    }

}
