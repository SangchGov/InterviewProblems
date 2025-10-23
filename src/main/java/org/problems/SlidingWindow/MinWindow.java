package org.problems.SlidingWindow;


public class MinWindow {

    public String minWindow(String s, String t) {

        if (s.isEmpty() || t.isEmpty() ||
                s.length() < t.length()) {
            return "";
        }

        int[] askiMap = new int[128];
        for (char c : t.toCharArray()) {
            askiMap[c]++;
        }

        char[] charView = s.toCharArray();


        int     left = 0,
                right = 0,
                count = t.length(),
                minLen = Integer.MAX_VALUE,
                startIndex = 0;


        while (right < charView.length){

            char ch =charView[right];
            right++;
            askiMap[ch]--;
            if(askiMap[ch] >= 0){
                count--;
            }


            while (count == 0) {
                if (right - left < minLen) {
                    startIndex = left;
                    minLen = right - left;
                }

                ch = charView[left];
                left++;
                askiMap[ch]++;
                if (askiMap[ch] > 0){
                    count++;
                }

            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        } else {
            return new String(charView, startIndex, minLen);
        }

    }
}

//Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every
// character in t (including duplicates) is included in the window. If there is no such substring, return
// the empty string "".
//
//The testcases will be generated such that the answer is unique.
//
//
//
//Example 1:
//
//Input: s = "ADOBECODEBANC", t = "ABC"
//Output: "BANC"
//Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
//Example 2:
//
//Input: s = "a", t = "a"
//Output: "a"
//Explanation: The entire string s is the minimum window.
//Example 3:
//
//Input: s = "a", t = "aa"
//Output: ""
//Explanation: Both 'a's from t must be included in the window.
//Since the largest window of s only has one 'a', return empty string.