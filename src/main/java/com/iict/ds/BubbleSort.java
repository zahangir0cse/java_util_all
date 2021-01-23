package com.iict.ds;

public class BubbleSort {
    public static int[] bubbleSort(int[] elements) {
        int numberOfElements = elements.length; // 4
//        int temp;
        for (int i = 0; i < numberOfElements; i++) {// 2, 3, 5, 10
            for (int j = 0; j < numberOfElements - i - 1; j++) { // numberOfElements - i - 1 = 3
                if (elements[j] > elements[j + 1]) { // 2, 3, 5, 10
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
        int[] elements = {10, 2, 3, 5};
        int[] bubbleSortOfElements = bubbleSort(elements);
        BinarySearch.printElements("Sorted Elements by Bubble Sort: ", bubbleSortOfElements);
    }
}
