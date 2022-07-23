package com.iict.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ValidateBinarySearchTree {
    public static boolean isValidBST(TreeNode1 root){
        if(root == null){
            return true;
        }
        List<Integer> traversedList = new ArrayList<>();
        inOrderTraversal(root, traversedList);
        return isIncreasingOrder(traversedList);
    }

    private static void inOrderTraversal(TreeNode1 root, List<Integer> traversedList){
        if (root == null){
            return;
        }
        inOrderTraversal(root.left, traversedList);
        traversedList.add(root.val);
        inOrderTraversal(root.right, traversedList);
    }
    private static boolean isIncreasingOrder(List<Integer> traversedList){
        for (int i = 1; i < traversedList.size(); i++) {
            if(traversedList.get(i) <= traversedList.get(i -1)){
                return false;
            }
        }
        return true;
    }
}
