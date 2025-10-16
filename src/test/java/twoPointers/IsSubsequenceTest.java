package twoPointers;

import org.example.twoPointers.IsSubsequence;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsSubsequenceTest {

    IsSubsequence isSubsequence = new IsSubsequence();

    @Test
    void test1() {

        Assertions.assertTrue(isSubsequence.isSubsequence("abc","ahbgdc"));

    }

    @Test
    void test2() {

        Assertions.assertFalse(isSubsequence.isSubsequence("axc", "ahbgdc"));

    }

    @Test
    void test3() {

        Assertions.assertTrue(isSubsequence.isSubsequence("abc", "ahsjskfjfksdfjsdlfjsklbgdfsdfsdfsdfsdfsfdsdfsdfsdfsfsdfsdfsdfsdfsdsfdsfsdfsdfsdfsfssmkvsvklsvskc"));

    }



}
