package com.iict.leetcode;

import java.util.*;

public class WordBreak {

    public static boolean wordBreak(String s, List<String> wordDict){
        Set<String> wordDictSet = new HashSet<>(wordDict);
        boolean [] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = i; j >=1 && !dp[i] ; --j) {
                dp[i] |= wordDictSet.contains(s.substring(j-1, i)) && dp[j-1];
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        List<String> wordDict = new ArrayList<>();
        wordDict.add("apple");
        wordDict.add("apple");
        wordDict.add("pie");
        wordDict.add("ten");
        System.out.println(wordBreak("applepie", wordDict));
    }
}
