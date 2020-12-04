package com.iict.math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CalculateOddEven {
    public static void main(String[] args) {
        System.out.println("Please Enter a positive number: ");
        Integer num = new Scanner(System.in).nextInt();
        if (num > 0) {
            String numberString = num.toString();
            StringBuilder oddBuilder = new StringBuilder("");
            List<Integer> oddList = new ArrayList<>();
            List<Integer> evenList = new ArrayList<>();
            StringBuilder evenBuilder = new StringBuilder("");
            for (int i = 0; i < numberString.length(); i++) {
                if ((int) numberString.charAt(i) % 2 != 0) {
                    oddList.add(Character.getNumericValue(numberString.charAt(i)));
                    oddBuilder.append(" ").append(numberString.charAt(i));
                } else {
                    evenList.add(Character.getNumericValue(numberString.charAt(i)));
                    evenBuilder.append(" ").append(numberString.charAt(i));
                }
            }
            Collections.sort(evenList);
            Collections.sort(oddList);
            evenList.addAll(oddList);
            System.out.println("The even digits are " + evenBuilder.toString());
            System.out.println("The odd digits are " + oddBuilder.toString());
            System.out.print("The resulting number is: ");
            evenList.forEach(System.out::print);

        }

    }
}
