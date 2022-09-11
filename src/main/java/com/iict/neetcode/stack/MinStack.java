package com.iict.neetcode.stack;

import java.util.ArrayList;
import java.util.List;

public class MinStack {
    public List<Integer> list;
    public int minVal;
    public MinStack(){
        this.list = new ArrayList<>();
        minVal = Integer.MIN_VALUE;
    }
    public void push(int val){
        if(this.list != null && this.list.size() > 0){
            if(this.minVal <= val){
                this.list.add(val);
            }else {
                this.list.add(2*val - this.minVal);
                this.minVal = val;
            }
        }else {
            if(this.list != null){
                this.list.add(val);
                this.minVal = val;
            }
        }
    }

    public void pop(){
        if(this.list != null && this.list.size() > 0){
            int currentVal = this.list.get(this.list.size() - 1);
            this.list.remove(this.list.size() - 1);
            if(currentVal < this.minVal){
                this.minVal = 2*minVal - currentVal;
            }
        }
    }

    public int top(){
        int currentVal = this.list.get(this.list.size() - 1);
        if(currentVal < this.minVal){
            return minVal;
        }
        return currentVal;
    }

    public int getMin(){
        return this.minVal;
    }
}
