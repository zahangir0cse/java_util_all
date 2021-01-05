package com.iict.ds;

public class BST {
    Node root;

    private Node addRecursive(Node currentNode, int value) {
        if (currentNode == null) {
            return new Node(value);
        }
        if (value >= currentNode.value) {
            currentNode.right = addRecursive(currentNode.right, value);
        } else {
            currentNode.left = addRecursive(currentNode.left, value);
        }
        return currentNode;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    public boolean containsNodeRecursive(Node currentNode, int value) {
        if (currentNode == null) {
            return false;
        }
        if (currentNode.value == value) {
            return true;
        }
        return (value > currentNode.value) ? containsNodeRecursive(currentNode.right, value) : containsNodeRecursive(currentNode.left, value);
    }
/*
* Once we find the node to delete, there are 3 main different cases:

    1.  a node has no children – this is the simplest case;
        we just need to replace this node with null in its parent node
    2.  a node has exactly one child – in the parent node,
        we replace this node with its only child.
    3. a node has two children – this is the most complex case
        because it requires a tree reorganization
* */
    public Node deleteRecursive(Node currentNode, int value) {
        if (currentNode == null) {
            return null;
        }
        if (currentNode.value == value) {//Delete logic Here
            if (currentNode.left == null && currentNode.right == null) {
                return null;
            }
            if (currentNode.right == null) {
                return currentNode.left;
            }
            if (currentNode.left == null) {
                return currentNode.right;
            }
            int smallestValue = findSmallestValue(currentNode.right);
            currentNode.value = smallestValue;
            currentNode.right = deleteRecursive(currentNode.right, smallestValue);
            return currentNode;
        }
        return (value > currentNode.value) ? deleteRecursive(currentNode.right, value) : deleteRecursive(currentNode.left, value);
    }

    public void delete(int value){
        root = deleteRecursive(root, value);
    }

    private int findSmallestValue(Node rootNode) {
        return rootNode.left == null ? rootNode.value : findSmallestValue(rootNode.left);
    }

    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    public static void main(String[] args) {
        BST bst = new BST();
        bst.add(5);
        bst.add(10);
        bst.add(3);
        bst.add(11);
        bst.add(15);
        bst.add(35);
        bst.add(25);
        bst.add(12);
        bst.add(19);
        bst.add(20);
        bst.add(6);
        System.out.println(bst.containsNode(25));
        bst.delete(25);
        System.out.println(bst.containsNode(25));
    }
}

class Node {
    int value;
    Node left;
    Node right;

    public Node() {
    }

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}