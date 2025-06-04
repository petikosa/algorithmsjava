package com.algorithms.algorithms.basic;

import java.util.LinkedList;
import java.util.Queue;

public class Trees {

    public static class Node {
        public int data;
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

    public static void mirror(Node root) {
        if (root == null) {
            return;
        }
        mirror(root.left);
        mirror(root.right);

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    public static boolean isIdentical(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        } else if (root1 != null && root2 == null) {
            return false;
        } else if (root1 == null) {
            return false;
        } else {
            return root1.data == root2.data &&
                    isIdentical(root1.left, root2.left) &&
                    isIdentical(root1.right, root2.right);
        }
    }

    public static Node lowestCommonAncestor(Node root, Node firstNode, Node secondNode) {
        while (root != null) {
            if (root.data < Math.min(firstNode.data, secondNode.data)) {
                root = root.right;
            }
            else if (root.data > Math.max(firstNode.data, secondNode.data)) {
                root = root.left;
            }
            else {
                return root;
            }
        }
        return null;
    }
}
