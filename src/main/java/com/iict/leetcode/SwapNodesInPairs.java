package com.iict.leetcode;

public class SwapNodesInPairs {
    public static void main(String[] args) {
        System.out.println(swapPairs(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))))));
    }

    public static ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = head;
        while(head != null && head.next != null){
                int temp = head.val;
                head.val = head.next.val;
                head.next.val = temp;
                head = head.next.next;
        }
        return dummy;
    }
}
