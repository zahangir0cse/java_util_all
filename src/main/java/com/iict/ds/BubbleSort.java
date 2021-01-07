package com.iict.ds;

public class BubbleSort {
    public static int[] bubbleSort(int[] elements) {
        int numberOfElements = elements.length;
        int temp;
        for (int i = 0; i < numberOfElements; i++) {
            for (int j = 0; j < numberOfElements - i - 1; j++) {
                if (elements[j] > elements[j + 1]) {
                    /*temp = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;*/
                    elements[j] = elements[j] + elements[j+1];
                    elements[j+1] = elements[j] - elements[j+1];
                    elements[j] = elements[j] - elements[j+1];
                }
            }
        }
        return elements;
    }

    public static void main(String[] args) {
        int[] elements = {10, 2, 3, 5, 1, 12, 7};
        int[] bubbleSortOfElements = bubbleSort(elements);
        BinarySearch.printElements("Sorted Elements by Bubble Sort: ", bubbleSortOfElements);
    }
}
