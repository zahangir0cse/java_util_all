package com.iict.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthSmallestBST {
    public static void main(String[] args) {
//        TreeNode root = new TreeNode(5);
//        root.left = new TreeNode(3);
//        root.left.right = new TreeNode(4);
//        root.left.left = new TreeNode(2);
//        root.left.left.left = new TreeNode(1);
//        root.right = new TreeNode(6);
//        System.out.println(kthSmallest(root, 1));
        int ans = 6;
        ans ^= 2;
        System.out.println( ans);
    }
    public static int kthSmallest(TreeNode root, int k) {
        if(root == null){
            return 0;
        }
        List<Integer> elements = new ArrayList<>();
        inOrderTraversal(root, elements);
        if(k > 0 && k <= elements.size()){
            return elements.get(k-1);
        }
        return 0;
    }

    public static int kthLargest(TreeNode root, int k){
        if(root == null){
            return 0;
        }
        List<Integer> elements = new ArrayList<>();
        inOrderTraversal(root, elements);
        Collections.reverse(elements);
        if(k > 0 && k <= elements.size()){
            return elements.get(k-1);
        }
        return 0;
    }

    private static void inOrderTraversal(TreeNode root, List<Integer> elements){
        if(root != null){
            inOrderTraversal(root.left, elements);
            elements.add(root.val);
            inOrderTraversal(root.right, elements);
        }
    }
}
