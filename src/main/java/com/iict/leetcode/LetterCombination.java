package com.iict.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombination {
    static List<String> outputList = new ArrayList<>();

    static Map<String, String> phoneMap = new HashMap<String, String>(){{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};

    public static void main(String[] args) {
        System.out.println(letterCombinations("345"));
    }

    public static List<String> letterCombinations(String digits) {
        phoneMap.put("2", "abc");
        phoneMap.put("3", "def");
        phoneMap.put("4", "ghi");
        phoneMap.put("5", "jkl");
        phoneMap.put("6", "mno");
        phoneMap.put("7", "pqrs");
        phoneMap.put("8", "tuv");
        phoneMap.put("9", "wxyz");
        if(digits.length() != 0){
            backtrack("", digits);
        }
        return outputList;
    }

    private static void backtrack(String combination, String nextDigits){
        if(nextDigits.length() == 0){
            outputList.add(combination);
        }else{
            String digit = nextDigits.substring(0, 1);
            String letters = phoneMap.get(digit);
            for(int i = 0; i < letters.length(); i++){
                String letter = phoneMap.get(digit).substring(i, i+1);
                backtrack(combination + letter, nextDigits.substring(1));
            }
        }
    }
}
