package com.iict.ds;

public class SelectionSort {
    public static int[] selectionSort(int[] elements) {
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
                temp = elements[index];
                elements[index] = elements[minIndex];
                elements[minIndex] = temp;
            }
        }
        return elements;
    }

    public static void main(String[] args) {
        int elements[] = {10, 2, 3, 5, 1, 12, 7};
        int selectionSortOfElements[] = selectionSort(elements);
        System.out.println("Sorted Elements by Selection Sort: ");
        for (int i = 0; i < selectionSortOfElements.length; i++) {
            if (i == 0) {
                System.out.print("{" + selectionSortOfElements[i] + ",");
            } else if (i < selectionSortOfElements.length - 1) {
                System.out.print(selectionSortOfElements[i] + ",");
            } else {
                System.out.print(selectionSortOfElements[i] + "}");
            }
        }
    }
}
