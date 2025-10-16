import org.example.Arrays.MergeSortedArray;
import org.example.FizzbuzzTestInterview;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzInterviewTest {

    FizzbuzzTestInterview fizzBuzzTestInterview = new FizzbuzzTestInterview();

    @Test
    void test3(){
        var bytes = fizzBuzzTestInterview.fizzBuzzInterview(3);
        Assertions.assertArrayEquals("Fizz".getBytes(), bytes);
    }

    @Test
    void test5(){
        var bytes = fizzBuzzTestInterview.fizzBuzzInterview(5);
        Assertions.assertArrayEquals("Buzz".getBytes(), bytes);
    }

    @Test
    void test3n5(){
        var bytes = fizzBuzzTestInterview.fizzBuzzInterview(15);
        Assertions.assertArrayEquals("FizzBuzz".getBytes(), bytes);
    }

    @Test
    void testException(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> fizzBuzzTestInterview.fizzBuzzInterview(1));
    }

    public static class MergeSortedArrayTest {

        private final MergeSortedArray mergeSortedArray = new MergeSortedArray();

        @Test
        void errorExceptionTest() {

            int[] nums1 = {1, 2, 3, 0};
            int[] nums2 = {1, 3};
            int n = 4;
            int m = 2;

            Assertions.assertThrows(RuntimeException.class, () ->
                    mergeSortedArray.mergeSortedArray(nums1, m, nums2, n)
            );
        }

        @Test
        void firstTest(){

            int[] nums1 = {1, 2, 3, 0, 0, 0};
            int[] nums2 = {2, 5, 6};
            int m = 3;
            int n = 3;

            mergeSortedArray.mergeSortedArray(nums1, m, nums2, n);

            Assertions.assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
        }

        @Test
        void SecondTest(){

            int[] nums1 = {1};
            int[] nums2 = {};
            int n = 0;
            int m = 1;

            mergeSortedArray.mergeSortedArray(nums1, m, nums2, n);

            Assertions.assertArrayEquals(new int[]{1},nums1);
        }

        @Test
        void ThirdTest(){

            int[] nums1 = {0};
            int[] nums2 = {1};
            int n = 1;
            int m = 0;

            mergeSortedArray.mergeSortedArray(nums1, m, nums2, n);

            Assertions.assertArrayEquals(new int[]{1},nums1);
        }

        @Test
        void myOwnTest(){

            int[] nums1 = {1, 2, 3, 8, 15, 0, 0, 0};
            int[] nums2 = {2, 5, 9};
            int m = 5;
            int n = 3;

            mergeSortedArray.mergeSortedArray(nums1, m, nums2, n);

            Assertions.assertArrayEquals(new int[]{1, 2, 2, 3, 5, 8, 9, 15}, nums1);
        }

    }
}
