package com.iict.neetcode.stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evalRPN(String [] tokens){
        if(tokens == null || tokens.length == 0){
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        for(String s: tokens){
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                int first = 0, second = 0;
                if(!stack.isEmpty()){
                    first = stack.pop();
                }
                if(!stack.isEmpty()){
                    second = stack.pop();
                }
                switch (s){
                    case "+":
                        stack.push(first+second);
                        break;
                    case "-":
                        stack.push(second - first);
                        break;
                    case "*":
                        stack.push(first * second);
                        break;
                    default:
                        stack.push(second / first);
                }
            }else {
                stack.push(Integer.valueOf(s));
            }
        }
        return !stack.isEmpty()?stack.pop():0;
    }
}
