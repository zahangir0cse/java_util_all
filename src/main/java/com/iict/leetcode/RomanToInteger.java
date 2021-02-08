package com.iict.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
    public static int romanToInt(String s) {
        if(s == null || s.isEmpty()){
            return 0;
        }
        Map<Character, Integer> romanNumMap = new HashMap<>();
        romanNumMap.put('I', 1);
        romanNumMap.put('V', 5);
        romanNumMap.put('X', 10);
        romanNumMap.put('L', 50);
        romanNumMap.put('C', 100);
        romanNumMap.put('D', 500);
        romanNumMap.put('M', 1000);
        List<Integer> integerList = new ArrayList<>();
        for(int i = 0; i<s.length(); i++){
            if(i == 0){
                integerList.add(romanNumMap.get(s.charAt(i)));
            }else{
                if(integerList.get(i-1) < romanNumMap.get(s.charAt(i))){
                    int value = romanNumMap.get(s.charAt(i)) - integerList.get(i-1);
                    integerList.set(i-1, 0);
                    integerList.add(value);
                }else{
                    integerList.add(romanNumMap.get(s.charAt(i)));
                }
            }
        }
        final Integer [] total = {0};
        integerList.forEach(it->{
            total[0] += it;
        });
        return total[0];
    }
}
