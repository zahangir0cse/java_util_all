package com.iict.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Pascale {
    public static void main(String[] args) {
        getRow(3);
    }
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        double val = 1;
        for(int colindex = 0; colindex<=rowIndex; colindex ++){
            res.add((int)val);
            val = val*(rowIndex - colindex)/(colindex + 1);
        }
        return res;
    }
}
