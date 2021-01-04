package com.iict.leetcode;

import java.util.StringTokenizer;

public class Test {
    public void test(){
        Test1 t1 = new Test1(4);
        Test1 t2 = t1;
        t2.a = 3;
        System.out.println(t1.a);
    }

    public static void main(String[] args) {
        new Test().test();
        char [] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        String s1 = new String("Hello Java");
        s1.regionMatches(1, "Hello ",1, 4 );
        s1.getChars(1, 4, charArray, 3);
//        StringTokenizer stringTokenizer = new StringTokenizer()
    }

}

class Test1{
    int a;
    public Test1() {}
    public Test1(int a) {
        this.a = a;
    }
}