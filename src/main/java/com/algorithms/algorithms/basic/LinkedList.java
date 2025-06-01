package com.algorithms.algorithms.basic;

import java.util.HashSet;

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

    public static boolean findCycle(Node head) {
        HashSet<Node> processedNodes = new HashSet<>();
        while (head != null) {
            if (processedNodes.contains(head)) {
                return true;
            }
            processedNodes.add(head);
            head = head.next;
        }
        return false;
    }

    public static boolean findCycleFloyd(Node head) {
        Node slow = head;
        Node fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
