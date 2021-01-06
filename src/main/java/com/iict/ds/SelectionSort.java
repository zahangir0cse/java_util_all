package com.iict.ds;

public class SelectionSort {
    public static int[] selectionSort(int[] elements) { // Select the smallest no. and put it into first place, then next so on. Complexity O(n2)
        int numberOfElements = elements.length;
        int minIndex, temp;
        for (int index = 0; index < numberOfElements - 1; index++) {
            minIndex = index;
            for (int comparisonIndex = index + 1; comparisonIndex < numberOfElements; comparisonIndex++) {
                if (elements[comparisonIndex] < elements[minIndex]) {
                    minIndex = comparisonIndex;
                }
            }
            if (minIndex != index) {
                /*temp = elements[index];
                elements[index] = elements[minIndex];
                elements[minIndex] = temp;*/
                elements[index] =  elements[index] + elements[minIndex];
                elements[minIndex] = elements[index] - elements[minIndex];
                elements[index] = elements[index] - elements[minIndex];
            }
        }
        return elements;
    }

    public static void main(String[] args) {
        int[] elements = {10, 2, 3, 5, 1, 12, 7};
        int[] selectionSortOfElements = selectionSort(elements);
        BinarySearch.printElements("Sorted Elements by Selection Sort: ", selectionSortOfElements);
    }
}
