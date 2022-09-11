package com.iict.leetcode;

import java.util.Arrays;

public class NumberOfWeakCharactersInGame {
    public static void main(String[] args) {
        int[][] properties = {{1,5}, {1,1}, {1,2}, {6,3}, {6,7}, {6,6}, {3,6}};
        System.out.println(numberOfWeakCharacters(properties));

    }

    public static int numberOfWeakCharacters(int[][] properties) {
        int n = properties.length;
        int count = 0;

        Arrays.sort(properties, (a, b) -> (b[0] == a[0]) ? (a[1] - b[1]) : b[0] - a[0]);

        int max = 0;
        for (int i = 0; i < n; i++) {

            if (properties[i][1] < max) {
                count++;
            }
            max = Math.max(max, properties[i][1]);
        }
        return count;
    }
}
