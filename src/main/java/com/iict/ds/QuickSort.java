package com.iict.ds;

public class QuickSort {
    public static void main(String[] args) {
        int [] elements = {1, 3, 2, 4, 12, 5, 6};
        quickSort(elements, 0, 6);
        BinarySearch.printElements("Marge Sort: ", elements);
    }
    public static void quickSort(int [] elements, int startIndex, int endIndex){
        if (startIndex < endIndex) {
            int partitionIndex = partition(elements, startIndex, endIndex);
            quickSort(elements, startIndex, partitionIndex-1);
            quickSort(elements, partitionIndex+1, endIndex);
        }
    }
    public static int partition(int [] elements, int startIndex, int endIndex){
        int pivot = elements[endIndex];
        int i = startIndex - 1;
        for (int j = startIndex; j < endIndex; j++) {
            if(elements[j] <= pivot){
                i++;
                int swapTemp = elements[i];
                elements[i] = elements[j];
                elements[j] = swapTemp;
            }
        }
        int swapTemp = elements[i+1];
        elements[i+1] = elements[endIndex];
        elements[endIndex] = swapTemp;

        return i+1;
    }
}
