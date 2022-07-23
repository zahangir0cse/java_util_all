package com.iict.leetcode;

class LinkedListNode {
    int val;
    LinkedListNode next;
    LinkedListNode() {}
    LinkedListNode(int val) { this.val = val; }
    LinkedListNode(int val, LinkedListNode next) { this.val = val; this.next = next; }
}

public class MergeSortList {
    public static LinkedListNode margeSorted(LinkedListNode head1, LinkedListNode head2){
        if(head1 == null){
            return head2;
        }
        if(head2 == null){
            return head1;
        }
        LinkedListNode mergedHead = null;
        if(head1.val <= head2.val){
            mergedHead = head1;
            head1 = head1.next;
        }else {
            mergedHead = head2;
            head2 = head2.next;
        }
        LinkedListNode mergedTail = mergedHead;
        while (head1 != null && head2 != null){
            LinkedListNode temp = null;
            if(head1.val <= head2.val){
                temp = head1;
                head1 = head1.next;
            }else {
                temp = head2;
                head2 = head2.next;
            }
            mergedTail.next = temp;
            mergedTail = temp;
        }
        if(head1 != null){
            mergedTail.next = head1;
        }else if(head2 != null){
            mergedTail.next = head2;
        }
        return mergedHead;
    }

    public static void main(String[] args) {
        LinkedListNode head1 = new LinkedListNode(1, new LinkedListNode(3, new LinkedListNode(5, new LinkedListNode(7, null))));
        LinkedListNode head2 = new LinkedListNode(2, new LinkedListNode(4, new LinkedListNode(6, new LinkedListNode(8, new LinkedListNode(10, null)))));
        LinkedListNode merged = margeSorted(head1, head2);
        System.out.println(merged);
    }
}
