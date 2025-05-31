package com.algorithms.algorithms.basic;

import java.util.ArrayDeque;
import java.util.Deque;

public class Recursion {

    public static int fibr(int n) {
        if (n <= 1) {
            return n;
        }
        return fibr(n - 1) + fibr( n - 2);
    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        int prev = 0;
        int next = 1;
        for (int i = 1; i < n; i ++) {
            int x = next;
            next = prev + next;
            prev = x;
        }
        return next;
    }

    public static boolean validParentheses(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty() || !match(stack.pop(), c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean match(char leftBracket, char rightBracket) {
        return (leftBracket == '(' && rightBracket == ')') ||
                (leftBracket == '{' && rightBracket == '}') ||
                (leftBracket == '[' && rightBracket == ']');
    }


}
