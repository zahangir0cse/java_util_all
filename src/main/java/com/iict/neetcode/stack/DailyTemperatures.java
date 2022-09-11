package com.iict.neetcode.stack;

import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Pair> pairStack = new Stack<>();
        int [] ans = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while ( !pairStack.isEmpty() && pairStack.peek().val < temperatures[i]) {
                Pair pair = pairStack.pop();
                ans[pair.index] = i - pair.index;
            }
            pairStack.push(new Pair(temperatures[i],i));
        }
        return ans;
    }
}

class Pair {
    public int val;
    public int index;
    Pair(){}
    Pair(int val ,int index){
        this.val = val;
        this.index = index;
    }
}
