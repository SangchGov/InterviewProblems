package SlidingWIndow;

import org.problems.SlidingWindow.MinWindow;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinWindowTest {

    MinWindow minWindow = new MinWindow();

    @Test
    void test1(){

        Assertions.assertEquals("BANC", minWindow.minWindow("ADOBECODEBANC", "ABC"));

    }

    @Test
    void test2() {
        Assertions.assertEquals("a", minWindow.minWindow("a", "a"));
    }

    @Test
    void test3() {
        Assertions.assertEquals("", minWindow.minWindow("a", "aa"));
    }

}
