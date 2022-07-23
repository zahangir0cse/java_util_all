package com.iict.function;

import java.util.Arrays;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> function = String::length;
        Function<Integer, Integer> function2 = x -> x * 2;
        System.out.println(function.apply("test"));
        System.out.println(function2.apply(4));
        Integer result = function.andThen(function2).apply("Hello Function"); // Chain Function
        System.out.println(result);
//        a(5, 5, 5);
    }

//    static void a(int a, int ...b){
//        System.out.println(a);
//    }
//    static void a(int ...b){
//        System.out.println(Arrays.toString(b));
//    }
}
