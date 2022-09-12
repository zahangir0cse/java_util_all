package com.iict.neetcode.linkedlist;


public class ReorderList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        new ReorderList().reorderList(head);
        System.out.println(head);
    }
    public void reorderList(ListNode head) {
        ListNode mid = getMidPointer(head);
        ListNode second = reverseList(mid);
        ListNode first = head;
        merge(first, second);
    }

    private void merge(ListNode first, ListNode second){
        while (first != null && second != null){
            ListNode temp = first.next;
            first.next = second;
            first = temp;
            temp = second.next;
            second.next = first;
            second = temp;
        }
        if(first != null){
            first.next = null;
        }
    }

    private ListNode reverseList(ListNode head){
        ListNode current = head, prev = null, next = null;
        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    private ListNode getMidPointer(ListNode head){
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
