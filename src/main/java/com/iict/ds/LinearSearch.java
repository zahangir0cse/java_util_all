package com.iict.ds;

public class LinearSearch {
    public static int searchResultByLinerSearch(int [] elements, int searchElement) { // Complexity = O(n)
        for (int i = 0; i < elements.length; i++) {
            if(elements[i] == searchElement){
                return i;
            }
        }
        return -1; //Worst Case Complexity O(n)
    }

    public static void main(String[] args) {
        int [] elements = {10,20, 5, 30, 50};
        int searchResultIndex = searchResultByLinerSearch(elements, 2);
        if(searchResultIndex == -1){
            System.out.println("Searched element not found");
        }else {
            System.out.println("Searched element found in "+searchResultIndex+ " position");
        }
    }
}
