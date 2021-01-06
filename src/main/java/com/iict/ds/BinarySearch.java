package com.iict.ds;

import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] elements, int firstIndex, int lastIndex, int searchElement) {
        while (firstIndex <= lastIndex) {
            int midIndex = (firstIndex + lastIndex) / 2;
            if (elements[midIndex] == searchElement) {
                return midIndex;
            }
            if ((elements[midIndex] > searchElement)) {
                lastIndex = midIndex - 1;
            } else {
                firstIndex = midIndex + 1;
            }

        }
        return -1;
    }

    public static int binarySearchByRecursion(int[] elements, int firstIndex, int lastIndex, int searchElement) {
        if (firstIndex <= lastIndex) {
            int midIndex = (firstIndex + lastIndex) / 2;
            if (elements[midIndex] == searchElement) {
                return midIndex;
            }
            return (elements[midIndex] > searchElement) ? binarySearchByRecursion(elements, firstIndex, midIndex - 1, searchElement) : binarySearchByRecursion(elements, midIndex + 1, lastIndex, searchElement);
        }
        return -1;
    }

    public static void printElements(String message, int[] elements) {
        System.out.println(message);
        for (int i = 0; i < elements.length; i++) {
            if (i == 0) {
                System.out.print("{" + elements[i] + ",");
            } else if (i < elements.length - 1) {
                System.out.print(elements[i] + ",");
            } else {
                System.out.print(elements[i] + "}");
            }
        }
    }

    public static void main(String[] args) {
        int[] elements = {10, 20, 5, 30, 50};
        Arrays.sort(elements); //In Binary search elements array must be sorted.
        printElements("Sorted Elements: ", elements);
        System.out.println();
        int searchElement = 31;
        int searchResultIndex = binarySearch(elements, 0, elements.length - 1, searchElement);
        int searchResultIndexByRecursion = binarySearchByRecursion(elements, 0, elements.length - 1, searchElement);
        if (searchResultIndex == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Searched element found in " + searchResultIndex + " position");
        }
        if (searchResultIndexByRecursion == -1) {
            System.out.println("Element not found by recursion");
        } else {
            System.out.println("Searched element found in " + searchResultIndexByRecursion + " position by recursion");
        }
    }

}
