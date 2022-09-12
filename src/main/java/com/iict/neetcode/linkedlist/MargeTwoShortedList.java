package com.iict.neetcode.linkedlist;

public class MargeTwoShortedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ListNode head1 = new ListNode(2);
        head1.next = new ListNode(4);
        head1.next.next = new ListNode(5);
        head1.next.next.next = new ListNode(6);
        head1.next.next.next.next = new ListNode(7);
        mergeTwoLists(head, head1);
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        while (l1 != null && l2 != null){
            if(l1.val < l2.val){
                tail.next = l1;
                l1 = l1.next;
            }else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        if(l1 != null){
            tail.next = l1;
        }
        if(l2 != null){
            tail.next = l2;
        }
        return dummy.next;
    }
}
