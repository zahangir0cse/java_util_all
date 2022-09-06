package com.iict.leetcode;

public class BinaryTreePruning {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(0);
        root.right = new TreeNode(1);
        root.right.right = new TreeNode(0);
        root.right.right.right = new TreeNode(1);
        root.right.right.left = new TreeNode(0);
        pruneTree(root);
    }
    public static TreeNode pruneTree(TreeNode root) {
        if(root == null){
            return null;
        }
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if(root.val == 0 && root.left == null && root.right == null){
            return null;
        }
        return root;
    }
}
