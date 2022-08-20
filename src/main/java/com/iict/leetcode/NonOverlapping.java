package com.iict.leetcode;

import java.util.Arrays;

public class NonOverlapping {
    public static void main(String[] args) {
        int [][] intervals = {{1,2},{2,3},{3,4},{1,3}};
        eraseOverlapIntervals(intervals);
    }
    public static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a, b) -> (a[0] - b[0]));
        int prevEnd = intervals[0][1];
        int ans = 0;
        for(int i = 1;i < intervals.length ; i++) {
            int s = intervals[i][0];
            int e = intervals[i][1];

            if(s >= prevEnd) {
                prevEnd = e;
            }else {
                ans++;
                prevEnd = Math.min(e,prevEnd);
            }
        }
        return ans;
    }
}
