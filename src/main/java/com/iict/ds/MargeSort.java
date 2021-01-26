package com.iict.ds;

public class MargeSort {
    public static void main(String[] args) {
        int [] elements = {1, 3, 2, 4, 12, 5, 6};
        margeSort(elements);
        BinarySearch.printElements("Marge Sort: ", elements);
    }

    public static void margeSort(int[] elements) {
        int numberOfElements = elements.length;
        if (numberOfElements < 2) {
            return;
        }
        int mid = numberOfElements / 2;
        int leftElements[] = new int[mid];
        int rightElements[] = new int[numberOfElements - mid];
        for (int i = 0; i < leftElements.length; i++) {
            leftElements[i] = elements[i];
        }
        for (int i = mid; i < numberOfElements; i++) {
            rightElements[i - mid] = elements[i];
        }
        margeSort(leftElements);
        margeSort(rightElements);
        marge(elements, leftElements, rightElements);
    }

    public static void marge(int[] elements, int[] leftElements, int[] rightElements) {
        int numberOfLeftElements = leftElements.length;
        int numberOfRightElements = rightElements.length;
        int leftIndex = 0, rightIndex = 0, mainIndex = 0;
        while (leftIndex < numberOfLeftElements && rightIndex < numberOfRightElements) {
            if(leftElements[leftIndex] <= rightElements[rightIndex]){
                elements[mainIndex++] = leftElements[leftIndex++];
            }else {
                elements[mainIndex++] = rightElements[rightIndex++];
            }
        }
        while (leftIndex < numberOfLeftElements) {
            elements[mainIndex++] = leftElements[leftIndex++];
        }
        while (rightIndex< numberOfRightElements) {
            elements[mainIndex++] = rightElements[rightIndex++];
        }


    }

}
