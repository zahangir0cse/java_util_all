package com.iict.leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
    public static List<String> generateParenthesis(int n) {
        List<String> resultList = new ArrayList<>();
        genAll(new char[2 * n], 0, resultList);
        return resultList;
    }

    public static void genAll(char[] current, int position, List<String> resultList) {
        if (position == current.length) {
            if (isValid(current)) {
                resultList.add(new String(current));
            }
        } else {
            current[position] = '(';
            genAll(current, position + 1, resultList);
            current[position] = ')';
            genAll(current, position + 1, resultList);
        }
    }

    public static boolean isValid(char[] current) {
        int balance = 0;
        for (char c : current) {
            if (c == '(') {
                balance++;
            } else {
                balance--;
            }
            if (balance < 0) {
                return false;
            }
        }
        return (balance == 0);
    }
}
