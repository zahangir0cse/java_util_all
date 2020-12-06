package com.iict.ds;

public class InsertionSort {
    public static int[] insertionSort(int[] elements) {
        int numberOfElements = elements.length;
        int temp, j;
        for (int i = 1; i < numberOfElements; i++) {
            temp = elements[i];
            j = i-1;
            while (j>=0 && elements[j]>temp){
                elements[j+1] = elements[j];
                j = j-1;
            }
            elements[j+1] = temp;
        }
        return elements;
    }

    public static void main(String[] args) {
        int[] elements = {10, 2, 3, 5, 1, 12, 7};
        int[] insertionSortOfElements = insertionSort(elements);
        BinarySearch.printElements("Sorted Elements by Insertion Sort: ", insertionSortOfElements);
    }
}
