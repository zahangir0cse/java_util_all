package com.iict.ds;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<E> {
    List<E> elementList = new ArrayList<>();

    void add(E e) {
        elementList.add(e);
    }

    boolean isEmpty() {
        return elementList.isEmpty();
    }

    E elementAt(int index) {
        return elementList.get(index);
    }

    int parentIndex(int index) {
        return (index - 1) / 2;
    }

    int leftChildIndex(int index) {
        return 2 * index + 1;
    }

    int rightChildIndex(int index) {
        return 2 * index + 2;
    }
}
