package com.iict.neetcode.array;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        int currentChar = '.';
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                currentChar = board[i][j];
                if(currentChar != '.'){
                    if(!set.add(currentChar + " in row " + i) || !set.add(currentChar + " in col " + j) || !set.add(currentChar + " in block " + i/3 + "_" + j/3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
