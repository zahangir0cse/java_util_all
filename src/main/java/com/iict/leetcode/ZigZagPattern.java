package com.iict.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ZigZagPattern {
    public static void main(String[] args) {
        System.out.println(convert("AUOHKJTGFVBNHFDRFVBNBCECYVED", 6));
    }
    public static String convert(String s, int numRows) {
        if(s == null || s.equals("")){
            return null;
        }
        if(numRows == 1){
            return s;
        }
        List<StringBuilder> rowList = new ArrayList<>();
        for(int i = 0; i < Math.min(numRows, s.length()); i++){
            rowList.add(new StringBuilder());
        }
        int currentRow = 0;
        boolean goingDown = false;
        for(char c : s.toCharArray()){
            rowList.get(currentRow).append(c);
            if(currentRow == 0 || currentRow == (numRows - 1)){
             goingDown = !goingDown;
            }
            currentRow += goingDown ? 1 : -1;
        }
        StringBuilder returnSb = new StringBuilder();
        for(StringBuilder row : rowList){
            returnSb.append(row);
        }
        return returnSb.toString();
    }
}
