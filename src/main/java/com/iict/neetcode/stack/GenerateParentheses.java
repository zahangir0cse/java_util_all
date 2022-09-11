package com.iict.neetcode.stack;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, 0, 0, "", n);
        return result;
    }

    private void backtrack(List<String> result, int open, int close, String current, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }
        if(open < max){
            backtrack(result, open + 1, close, current + "(", max);
        }
        if(close < open){
            backtrack(result, open, close + 1, current + ")", max);
        }
    }
}
