package Arrays;

import org.example.Arrays.RemoveDuplicates;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.util.Arrays.copyOf;

public class RemoveDuplicatesTest {

    private final RemoveDuplicates removeDuplicates = new RemoveDuplicates();


    @Test
    void test1() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int result = removeDuplicates.removeDuplicates(nums);
        Assertions.assertEquals(5, result);
        Assertions.assertArrayEquals(new int[]{1, 1, 2, 2, 3},
                copyOf(nums, result));
    }

    @Test
    void test2() {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        int result = removeDuplicates.removeDuplicates(nums);
        Assertions.assertEquals(7, result);
        Assertions.assertArrayEquals(new int[]{0, 0, 1, 1, 2, 3, 3},
                copyOf(nums, result));
    }

    @Test
    void test3() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int result = removeDuplicates.removeDuplicates(nums);
        Assertions.assertEquals(5, result);
        Assertions.assertArrayEquals(new int[]{1, 1, 2, 2, 3},
                copyOf(nums, result));
    }

}
