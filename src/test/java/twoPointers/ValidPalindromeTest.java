package twoPointers;

import org.example.twoPointers.ValidPalindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidPalindromeTest {

    ValidPalindrome validPalindrome = new ValidPalindrome();

    @Test
    void test1(){

        Assertions.assertTrue(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));

    }

    @Test
    void test2(){

        Assertions.assertFalse(validPalindrome.isPalindrome("race a car"));

    }

    @Test
    void test3(){

        Assertions.assertTrue(validPalindrome.isPalindrome(""));

    }


}
