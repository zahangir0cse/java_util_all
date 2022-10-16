package com.iict.leetcode;

public class DeleteNodeFromLinkedList {
    public static void main(String[] args) {
        ListNode root = new ListNode(3);
        root.next = new ListNode(4);
        root.next.next = new ListNode(5);
        root.next.next.next = new ListNode(5);
        root.next.next.next.next = new ListNode(7);
        deleteNode(root.next);
    }
    public static void deleteNode(ListNode node) {
        ListNode nextNode = node.next;
        node.val = nextNode.val;
        node.next = nextNode.next;
        //nextNode.next = null;
    }
}
