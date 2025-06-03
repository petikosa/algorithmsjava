package com.algorithms.algorithms.basic;

import java.util.LinkedList;
import java.util.Queue;

public class Trees {

    public static class Node {
        int data;
        public Node left;
        public Node right;

        public Node(int val) {
            data = val;
            left = null;
            right = null;
        }
    }

    public static int findDepth(Node root) {
        int depth = 0;
        if (root == null) {
            return 0;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int currentBreadth = queue.size();
            for (int i = 0; i < currentBreadth; i++) {
                Node current = queue.poll();
                if (current.right != null) {
                    queue.add(current.right);
                }
                if (current.left != null) {
                    queue.add(current.left);
                }
            }
            depth++;
        }

        return depth;
    }
}
