package com.iict.leetcode;

public class DeleteMiddleNode {
    public static void main(String[] args) {
        ListNode root = new ListNode(3);
        root.next = new ListNode(4);
        root.next.next = new ListNode(5);
        root.next.next.next = new ListNode(5);
        root.next.next.next.next = new ListNode(7);
        deleteMiddle(root);
    }
    public static ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode slow = head, fast = head.next.next;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
