package com.iict.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode1 left, right;

    public TreeNode() {
    }

    public TreeNode(int val, TreeNode1 left, TreeNode1 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class LevelOrderTraversalOfBinaryTree {
    public static List<List<Integer>> levelOrder(TreeNode1 root){
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode1> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int count = queue.size();
            List<Integer> tempList = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                TreeNode1 currentNode = queue.poll();
                if(currentNode != null){
                    tempList.add(currentNode.val);
                    if(currentNode.left != null){
                        queue.add(currentNode.left);
                    }
                    if(currentNode.right != null){
                        queue.add(currentNode.right);
                    }
                }
            }
            result.add(tempList);
        }
        return result;
    }
}
