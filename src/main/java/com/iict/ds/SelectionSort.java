package com.iict.ds;

public class SelectionSort {
    public static int[] selectionSort(int[] elements) { // Select the smallest no. and put it into first place, then next so on. Complexity O(n2)
        int numberOfElements = elements.length;
        int minIndex, temp;
        for (int index = 0; index < numberOfElements - 1; index++) { // 10, 2, 12, 1, 4, 6, 3, 8
            minIndex = index; // 0
            for (int comparisonIndex = index + 1; comparisonIndex < numberOfElements; comparisonIndex++) { // 1 --> n
                if (elements[comparisonIndex] < elements[minIndex]) {
                    minIndex = comparisonIndex; //1
                }
            }
            if (minIndex != index) { //0
                /*temp = elements[index];
                elements[index] = elements[minIndex];
                elements[minIndex] = temp;*///10      //1 =11
                elements[index] =  elements[index] + elements[minIndex]; // element[0] = 10 + 1
                elements[minIndex] = elements[index] - elements[minIndex]; //element[3] = 11 - 1 = 10
                elements[index] = elements[index] - elements[minIndex];//element[0] = 11 - 10 = 1
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
