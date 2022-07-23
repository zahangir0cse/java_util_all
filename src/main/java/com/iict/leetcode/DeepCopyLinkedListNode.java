package com.iict.leetcode;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

class LinkedListNode2{
    int val;
    LinkedListNode2 next;
    LinkedListNode2 arbitraryPointer;
    LinkedListNode2() {}
    LinkedListNode2(int val) { this.val = val; }
    LinkedListNode2(int val, LinkedListNode2 arbitraryPointer) {
        this.val = val;
        this.arbitraryPointer = arbitraryPointer;
    }
    LinkedListNode2(int val, LinkedListNode2 next, LinkedListNode2 arbitraryPointer) {
        this.val = val;
        this.next = next;
        this.arbitraryPointer = arbitraryPointer;
    }
}

public class DeepCopyLinkedListNode {
    public static LinkedListNode2 deepCopyLinkedListNodeWithRandomPointer(LinkedListNode2 head){
        if(head == null){
            return null;
        }
        LinkedListNode2 current = head;
        LinkedListNode2 newHead = null;
        LinkedListNode2 newPrev = null;
        Map<LinkedListNode2, LinkedListNode2> map = new Hashtable<>(); // Don't allow null as key & value
        while (current != null){
            LinkedListNode2 newNode = new LinkedListNode2(current.val, current.arbitraryPointer);
            if(newPrev != null){
                newPrev.next = newNode;
            }else {
                newHead = newNode;
            }
            map.put(current, newNode);
            newPrev = newNode;
            current = current.next;
        }
        LinkedListNode2 newCurrent = newHead;
        while (newCurrent != null){
            if(newCurrent.arbitraryPointer != null){
                newCurrent.arbitraryPointer = map.get(newCurrent.arbitraryPointer);
            }
            newCurrent = newCurrent.next;
        }
        return newHead;
    }

    public static void main(String[] args) {
        LinkedListNode2 node3 = new LinkedListNode2(3, null, null);
        LinkedListNode2 node2 = new LinkedListNode2(2, node3, null);
        LinkedListNode2 node1 = new LinkedListNode2(3, node2, node3);
        LinkedListNode2 head = new LinkedListNode2(0, node1, node2);
        LinkedListNode2 head2 = deepCopyLinkedListNodeWithRandomPointer(head);
    }
}
