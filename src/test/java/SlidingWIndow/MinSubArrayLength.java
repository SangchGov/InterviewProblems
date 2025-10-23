package SlidingWIndow;

import org.problems.SlidingWindow.MinSubArrayLen;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinSubArrayLength {

    MinSubArrayLen minSubArrayLen = new MinSubArrayLen();

    @Test
    void test1(){

        int result = minSubArrayLen.minSubArrayLen(
                7, new int[]{2,3,1,2,4,3}
        );

        Assertions.assertEquals(2, result);
    }

    @Test
    void test2(){

        int result = minSubArrayLen.minSubArrayLen(
                4, new int[]{1,4,4}
        );

        Assertions.assertEquals(1, result);

    }

    @Test
    void test3(){

        int result = minSubArrayLen.minSubArrayLen(
                11, new int[]{1,1,1,1,1,1,1,1}
        );

        Assertions.assertEquals(0, result);

    }

}
