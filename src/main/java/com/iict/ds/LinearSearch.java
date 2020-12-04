package com.iict.ds;

public class LinearSearch {
    public static int searchResult(int [] elements, int searchElement) {
        for (int i = 0; i < elements.length; i++) {
            if(elements[i] == searchElement){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] elements = {10,20, 5, 30, 50};
        int searchResultIndex = searchResult(elements, 2);
        if(searchResultIndex == -1){
            System.out.println("Searched element not found");
        }else {
            System.out.println("Searched element found in "+searchResultIndex+ " position");
        }
    }
}
