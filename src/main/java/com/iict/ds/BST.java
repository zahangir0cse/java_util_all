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
    public boolean containsNode(int value){
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
        System.out.println(bst.containsNode(50));
        System.out.println("hello");
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