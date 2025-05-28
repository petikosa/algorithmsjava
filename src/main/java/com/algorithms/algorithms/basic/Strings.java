package com.algorithms.algorithms.basic;

import java.util.HashMap;

public class Strings {

    // find out if given strings are anagrams
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0) + 1);
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
        }
        return countS.equals(countT);
    }

    // find out if the given string is a palindrome
    public static boolean isPalindrome(String s) {
        int n = s.length();
        boolean result = false;
        for (int i = 0; i < n / 2; i++){
            char left = s.charAt(i);
            char right = s.charAt(n - i - 1);
            result = left == right;
        }
        return result;
    }
}
