package com.algorithms.algorithms.basic;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueStack {

    private Deque<Integer> mainQueue = new ArrayDeque<>();
    private Deque<Integer> auxQueue = new ArrayDeque<>();

    public void push(int x) {
        auxQueue.offer(x);

        while (!mainQueue.isEmpty()) {
            auxQueue.offer(mainQueue.poll());
        }

        Deque<Integer> temp = mainQueue;
        mainQueue = auxQueue;
        auxQueue = temp;
    }

    public int pop() {
        return mainQueue.poll();
    }

    public int top() {
        return mainQueue.peek();
    }

    public boolean empty() {
        return mainQueue.isEmpty();
    }
}

