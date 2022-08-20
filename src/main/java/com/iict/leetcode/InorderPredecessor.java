package com.iict.leetcode;

public class InorderPredecessor {
    public TreeNode getInorderPredecessor(TreeNode root, int key){
        if(root == null){
            return null;
        }
        TreeNode predecessorNode = null;
        while (root != null){
            if(key >= root.val){
                predecessorNode = root;
                root = root.right;
            }else {
                root = root.left;
            }
        }
        return predecessorNode;
    }
}
