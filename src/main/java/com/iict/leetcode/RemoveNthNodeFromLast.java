package com.iict.leetcode;

public class RemoveNthNodeFromLast {
    public static void main(String[] args) {
        ListNode2 head = new ListNode2(1);
        head.next = new ListNode2(2, new ListNode2(3, new ListNode2(4,new ListNode2(5))));
        ListNode2 resultNode = removeNthFromEnd(head, 2);
        System.out.println(resultNode);
    }
    public static ListNode2 removeNthFromEnd(ListNode2 head, int n) {
        ListNode2 dummyNode = new ListNode2(0);
        dummyNode.next = head;
        int length = 0;
        ListNode2 firstNode = head;
        while(firstNode != null){
            length ++;
            firstNode = firstNode.next;
        }
        length -= n;
        firstNode = dummyNode;
        while(length >0){
            length --;
            firstNode = firstNode.next;
        }
        firstNode.next = firstNode.next.next;
        return dummyNode.next;
    }
}
class ListNode2 {
    int val;
    ListNode2 next;
    ListNode2() {}
    ListNode2(int val) { this.val = val; }
    ListNode2(int val, ListNode2 next) { this.val = val; this.next = next; }
}