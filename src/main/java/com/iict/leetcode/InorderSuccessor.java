package com.iict.leetcode;

public class InorderSuccessor {
    public TreeNode getInorderSuccessor(TreeNode root, int key){
        if(root == null){
            return null;
        }
        TreeNode successorNode = null;
        while (root != null){
            if(key >= root.val){
                root = root.right;
            }else {
                successorNode = root;
                root = root.left;
            }
        }
        return successorNode;
    }
}
