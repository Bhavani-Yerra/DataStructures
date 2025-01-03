package com.leetcode2024.twopointers;

/**
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 *
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abc", t = "ahbgdc"
 * Output: true
 * Example 2:
 *
 * Input: s = "axc", t = "ahbgdc"
 * Output: false
 */

public class IsSubsequence {
    public static void main(String[] args) {
        String input = "ahbgdc";
        String subString = "abc";
        System.out.println(isSubsequence(subString, input));
    }
    public static boolean isSubsequence(String s, String t) {
       int indexS =0;
       int indext = 0;
       int count = 0;
        while (indexS<s.length()){
            if (s.charAt(indexS) == t.charAt(indext)){
                count++;
                indext++;
                indexS++;
            }
            else{
                indext++;
            }
        }
        if(count == s.length()) return true;
        return false;
    }
}
