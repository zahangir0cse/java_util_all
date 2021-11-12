package com.iict.leetcode;

import java.util.*;

public class PossibleBinary {
    public static void main(String[] args) {
//        long startTime = new Date().getTime();
//        binaryList("0110",2);
//        System.out.println("time required: " + (new Date().getTime() - startTime));
        System.out.println(hasAllCodes("10010010100110", 3));
    }

    public static boolean hasAllCodes(String s, int k) {
        int need = 1 << k;
        Set<String> got = new HashSet<>();

        for (int i = k; i <= s.length(); i++) {
            String a = s.substring(i - k, i);
            if (!got.contains(a)) {
                got.add(a);
                need--;
                // return true when found all occurrences
                if (need == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static List<String> binaryList(String s, int k) {
        int twoBaseK = getTwoBasedNPower(k);
        List<String> binaryList = new ArrayList<>();
        for (int i = 0; i < twoBaseK; i++) {
            String binary = getBinary(i);
            String binaryFixed = addFixBit(k, binary) + binary;
            System.out.println(binaryFixed);
            System.out.println(s.contains(binaryFixed));
            binaryList.add(binaryFixed);
        }
        return binaryList;
    }

    public static String addFixBit(int bit, String binaryNum){
        int zeroToAdd = bit - binaryNum.length();
        StringBuilder sb = new StringBuilder("");
        if(zeroToAdd > 0){
            for (int i = 0; i < zeroToAdd; i++) {
                sb.append("0");
            }
        }
        return sb.toString();
    }

    public static String getBinary(int n) {
        if(n == 0){
            return "0";
        }
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; n > 0; i++) {
            intList.add(n % 2);
            n = n / 2;
        }
        StringBuilder sb = new StringBuilder("");
        if(intList.size() > 0){
            for (int i = intList.size()-1; i >= 0 ; i--) {
                sb.append(intList.get(i).toString());
            }
        }
        return sb.toString();
    }

    public static int getTwoBasedNPower(int n) {
        if (n <= 0) {
            return 1;
        }
        int result = 2;
        for (int i = 1; i < n; i++) {
            result = result * 2;
        }
        return result;
    }
}
