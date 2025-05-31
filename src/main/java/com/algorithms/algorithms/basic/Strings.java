package com.algorithms.algorithms.basic;

import java.util.HashMap;
import java.util.Map;

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

    // find the longest substring with no repeated characters and return the lenght of it
    public static int longestSubstring(String s) {
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        while (j < s.length()) {
            char ch = s.charAt(j);
            if (map.containsKey(ch)) {
                i = Math.max(map.get(ch), i);
            }
            result = Math.max(result, j - i + 1);
            map.put(ch, j + 1);
            j++;
        }
        return result;
    }

    // find out if one can construct the string ransomeNote from the string magazine
    public static boolean ransomeNoteHashMap(String ransomNote, String magazine) {
        HashMap<Character, Integer> letterCounts = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            Character key = magazine.charAt(i);
            int count = letterCounts.getOrDefault(key, 0);
            letterCounts.put(magazine.charAt(i), ++count);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            Character key = magazine.charAt(i);
            int count = letterCounts.getOrDefault(key, 0);
            letterCounts.put(magazine.charAt(i), --count);
            if (count < 0) {
                return false;
            }
        }
        return true;
    }
}
