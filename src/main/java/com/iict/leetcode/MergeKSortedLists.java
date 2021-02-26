package com.iict.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> l = new ArrayList<>();
        for(ListNode ln : lists){
            while(ln != null){
                l.add(ln.val);
                ln = ln.next;
            }
        }
        Collections.sort(l);
        ListNode head = new ListNode(0);
        ListNode h = head;
        for(int i: l){
            ListNode t = new ListNode(i);
            h.next = t;
            h = h.next;
        }
        h.next = null;
        return head.next;
    }
}
