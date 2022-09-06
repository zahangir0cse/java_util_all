package com.iict.leetcode;

public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptrA = headA, ptrB = headB;
        while (ptrA != ptrB) {
            ptrA = ptrA == null ? headB : ptrA.next;
            ptrB = ptrB == null ? headA : ptrB.next;
        }
        return ptrA;
    }

    public static void main(String[] args) {
        ListNode root1 = new ListNode(1);
        root1.next = new ListNode(2);
        root1.next.next = new ListNode(3);
        root1.next.next.next = new ListNode(4);
        root1.next.next.next.next = new ListNode(5);

        ListNode root2 = new ListNode(10);
        root2.next = new ListNode(11);
        root2.next.next = new ListNode(12);
        root2.next.next.next = new ListNode(13);
        root2.next.next.next.next = new ListNode(4);
        root2.next.next.next.next.next = new ListNode(5);

        /*ListNode root3 = new ListNode(1);
        root3.next = new ListNode(2);
//        ListNode root4 = new ListNode(4);
        ListNode root5 = new ListNode(0);
        root5.next = root3;
        root5.next.next.next = new ListNode(3);
//        root5.next.next = new ListNode(3);
//        root5.next = new ListNode(2);
        System.out.println(root5);*/

        new IntersectionOfTwoLinkedLists().getIntersectionNode(root1, root2);
    }
}
