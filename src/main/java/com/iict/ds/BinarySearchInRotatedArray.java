package com.iict.ds;

public class BinarySearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {6, 7, 1, 2, 3, 4, 5};
        int searchElement = 7;
        int searchIndex = binarySearchInPivotedArray(arr, searchElement);
        System.out.println(searchIndex);

    }

    public static int binarySearchInPivotedArray(int[] array, int searchElement) {
        int pivotIndex = findPivotIndex(array, 0, array.length - 1);
        if (array[pivotIndex] == searchElement) {
            return pivotIndex;
        }
        if (searchElement == array[0]) {
            return 0;
        }
        return  (searchElement > array[0]) ? binarySearch(array, 0, pivotIndex - 1, searchElement) : binarySearch(array, pivotIndex + 1, array.length - 1, searchElement);
    }

    public static int findPivotIndex(int[] array, int firstIndex, int lastIndex) {
        if (lastIndex < firstIndex) {
            return -1;
        }
        if (firstIndex == lastIndex) {
            return firstIndex;
        }
        int midIndex = (firstIndex + lastIndex) / 2;
        if (midIndex < lastIndex && array[midIndex] > array[midIndex + 1]) {
            return midIndex;
        }
        if (midIndex > firstIndex && array[midIndex] < array[midIndex - 1]) {
            return midIndex - 1;
        }
        if (array[firstIndex] >= array[midIndex]) {
            return findPivotIndex(array, firstIndex, midIndex - 1);
        }
        return findPivotIndex(array, midIndex + 1, lastIndex);
    }

    public static int binarySearch(int[] array, int firstIndex, int lastIndex, int searchElement) {
        if (firstIndex > lastIndex) {
            return -1;
        }
        int midIndex = (firstIndex + lastIndex) / 2;
        if (searchElement == array[midIndex]) {
            return midIndex;
        }
        return (searchElement < array[midIndex]) ? binarySearch(array, firstIndex, midIndex - 1, searchElement) : binarySearch(array, midIndex + 1, lastIndex, searchElement);
    }
}
