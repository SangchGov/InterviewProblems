package org.problems.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public int lengthOfLongestSubstring(String s) {

        int result = 0;
        int left = 0;

        Set<Character> charSet = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {

            while (charSet.contains(s.charAt(right))) {

                charSet.remove(s.charAt(left));
                left++;

            }

            charSet.add(s.charAt(right));
            result = Math.max(result, right - left + 1);

        }

        return result;
    }
}

//Given a string s, find the length of the longest substring without duplicate characters.
//
// A substring is a contiguous non-empty sequence of characters within a string.
//
//Example 1:
//
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
//Example 2:
//
//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
//Example 3:
//
//Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a substring
