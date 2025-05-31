package com.algorithms.algorithms.basic;

public class LinkedList {

    public static class Node {

        public Node next;
        public int data;

        Node(Node next, int data) {
            this.data = data;
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node reverseList(Node head) {
        Node curr =  head;
        Node prev = null;

        while (curr != null) {
            Node front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }
        return prev;
    }
}
