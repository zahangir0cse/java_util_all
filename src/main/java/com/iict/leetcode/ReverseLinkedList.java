package com.iict.leetcode;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(6);
        head.next.next = new ListNode(8);
        head.next.next.next = new ListNode(10);
        reverse(head);
    }
    public static ListNode reverse(ListNode head){
        if(head == null){
            return null;
        }
        ListNode newHead = head;
        if(head.next != null){
            newHead = reverse(head.next);
            head.next.next = head;
        }
        head.next = null;
        return newHead;
    }
}
