package com.iict.ds;

public class StackMain {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.peek() + " is in top");
        stack.pop();
        System.out.println(stack.peek() + " is in top");
        stack.push(50);
        System.out.println(stack.peek() + " is in top");
    }
}

class Stack {
    static final int MAX = 1000;
    int top;
    int elements[] = new int[MAX];

    boolean isEmpty() {
        return top < 0;
    }

    Stack() {
        top = -1;
    }

    boolean push(int element) {
        if (top > (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        }
        elements[++top] = element;
        System.out.println(element + " is inserted to stack");
        return true;
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        return elements[top--];
    }

    int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        return elements[top];
    }
}