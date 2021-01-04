package com.iict.leetcode;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(3, new ListNode(4, new ListNode(10, new ListNode(11))));
        ListNode l2 = new ListNode(3, new ListNode(4, new ListNode(10, new ListNode(11))));
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode newListNode = addTwoNumbers.addTwoNumbers(l1, l2);

    }
    public ListNode addTwoNumbers(ListNode p, ListNode q) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            /*if(sum<10){
                curr.val = sum;
            }*/
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}