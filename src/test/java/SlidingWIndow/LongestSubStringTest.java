package SlidingWIndow;

import org.problems.SlidingWindow.LongestSubString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestSubStringTest {

    LongestSubString longestSubString = new LongestSubString();

    @Test
    void test1() {

        Assertions.assertEquals(3, longestSubString.lengthOfLongestSubstring("abcabcbb"));

    }

    @Test
    void test2() {

        Assertions.assertEquals(1, longestSubString.lengthOfLongestSubstring("bbbbb"));

    }

    @Test
    void test3() {

        Assertions.assertEquals(3, longestSubString.lengthOfLongestSubstring("pwwkew"));

    }

}
