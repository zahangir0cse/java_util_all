package com.iict.ds;

public class HeapSort {
    public static void main(String[] args) {
        int [] heap = {0, 3, 4, 6, 2, 12, 7, 11, 15, 13};
        buildMaxHeap(heap, 9);
        BinarySearch.printElements("Max Heap: ", heap);
        heapSort(heap, 9);
        BinarySearch.printElements("Heap Sort: ", heap);
    }

    public static void heapSort(int [] heap, int heapSize){
        for (int i = heapSize; i > 1; i--) {
            heap[1] = heap[1] + heap[heapSize];
            heap[heapSize] = heap[1] - heap[heapSize];
            heap[1] = heap[1] - heap[heapSize];
            heapSize --;
            maxHeapify(heap, heapSize, 1);
        }
    }

    public static void maxHeapify(int [] heap, int heapSize, int parentIndex){
        int leftChildIndex = getLeftChildIndex(parentIndex);
        int rightChildIndex = getRightChildIndex(parentIndex);
        int largestIndex = parentIndex;
        if(leftChildIndex<= heapSize && heap[leftChildIndex] > heap[largestIndex]){
            largestIndex = leftChildIndex;
        }
        if(rightChildIndex<= heapSize && heap[rightChildIndex] > heap[largestIndex]){
            largestIndex = rightChildIndex;
        }
        if(largestIndex != parentIndex){
            heap[parentIndex] = heap[parentIndex] + heap[largestIndex];
            heap[largestIndex] = heap[parentIndex] - heap[largestIndex];
            heap[parentIndex] = heap[parentIndex] - heap[largestIndex];
            maxHeapify(heap, heapSize, largestIndex);
        }
    }


    public static void buildMaxHeap(int [] heap, int heapSize){
        for (int i = heapSize/2; i >=1; i--) {
            maxHeapify(heap, heapSize, i);
        }
    }

    public static int getLeftChildIndex(int parentIndex) {
        return 2 * parentIndex;
    }

    public static int getRightChildIndex(int parentIndex) {
        return (2 * parentIndex) + 1;
    }

    public static int getParentIndex(int childIndex) {
        return childIndex / 2;
    }

}
