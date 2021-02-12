package com.iict.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("({[]})"));
    }

    public static boolean isValid(String s) {
        if (s == null || s.length() < 2 || (s.length() % 2) != 0) {
            return false;
        }
        Map<Character, Character> charMap = new HashMap<>();
        charMap.put(')', '(');
        charMap.put('}', '{');
        charMap.put(']', '[');
        Stack<Character> characterStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (charMap.containsKey(currentChar)) {
                char top = characterStack.empty() ? '#' : characterStack.pop();
                if (top != charMap.get(currentChar)) {
                    return false;
                }
            } else {
                characterStack.push(currentChar);
            }
        }
        return characterStack.isEmpty();
    }
}
