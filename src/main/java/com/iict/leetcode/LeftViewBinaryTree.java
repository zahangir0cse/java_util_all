package com.iict.leetcode;

import java.util.ArrayList;
import java.util.List;

class TreeNode1 {
      int val;
      TreeNode1 left;
      TreeNode1 right;
      TreeNode1() {}
      TreeNode1(int val) { this.val = val; }
      TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class LeftViewBinaryTree {
    public List<Integer> leftSideView(TreeNode1 root) {
        List<Integer> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        move(root,0, result);
        return result;
    }

    void move(TreeNode1 node, int level, List<Integer> result){
        if(node!=null) {
            if (result.size() == level) {
                result.add(node.val);
            }
            move(node.left, level + 1, result);
            move(node.right, level + 1, result);
        }
    }
}
