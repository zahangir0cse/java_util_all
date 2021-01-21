package com.iict.ds;

public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node nextNode;

        public Node() {
        }

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node nextNode) {
            this.data = data;
            this.nextNode = nextNode;
        }
    }

    public static LinkedList deleteByKey(LinkedList linkedList, int key) {
        if (linkedList.head == null) {
            return null;
        }
        Node currentNode = linkedList.head;
        if (currentNode.data == key) {
            linkedList.head = currentNode.nextNode;
            return linkedList;
        }
        Node previousNode = linkedList.head;
        currentNode = currentNode.nextNode;
        while (currentNode != null && currentNode.data != key) {
            previousNode = currentNode;
            currentNode = currentNode.nextNode;
        }
        if (currentNode != null) {
            previousNode.nextNode = currentNode.nextNode;
        }
        return linkedList;
    }

    public static LinkedList insert(LinkedList linkedList, int data) {
        Node newNode = new Node(data);
        if (linkedList.head == null) {
            linkedList.head = newNode;
        } else {
            Node lastNode = linkedList.head;
            while (lastNode.nextNode != null) {
                lastNode = lastNode.nextNode;
            }
            lastNode.nextNode = newNode;
        }
        return linkedList;
    }

    public static LinkedList deleteAtPosition(LinkedList list, int index) {
        Node currNode = list.head, prev = null;

        if (index == 0 && currNode != null) {
            list.head = currNode.nextNode;
            return list;
        }
        int counter = 0;
        while (currNode != null) {

            if (counter == index) {
                prev.nextNode = currNode.nextNode;
                break;
            } else {
                prev = currNode;
                currNode = currNode.nextNode;
                counter++;
            }
        }
        if (currNode == null) {
            // Display the message
            System.out.println(index + " position element not found");
        }

        // return the List
        return list;
    }

    public static void printData(LinkedList linkedList) {
        if (linkedList.head == null) {
            System.out.println("No data in linked list");
            return;
        }
        StringBuilder builder = new StringBuilder("");
        Node currentNode = linkedList.head;
        while (currentNode != null) {
            builder.append(currentNode.data).append(" ");
            currentNode = currentNode.nextNode;
        }
        System.out.println(builder.toString());
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList = insert(linkedList, 1);
        linkedList = insert(linkedList, 10);
        linkedList = insert(linkedList, 11);
        linkedList = insert(linkedList, 12);
        linkedList = insert(linkedList, 3);
        linkedList = insert(linkedList, 4);
        linkedList = insert(linkedList, 6);
        linkedList = insert(linkedList, 2);
        linkedList = insert(linkedList, 19);
        linkedList = insert(linkedList, 13);
        linkedList = deleteByKey(linkedList, 10);
        linkedList = deleteByKey(linkedList, 12);
        linkedList = deleteByKey(linkedList, 1);
        linkedList = deleteByKey(linkedList, 13);
        printData(linkedList);
    }
}


