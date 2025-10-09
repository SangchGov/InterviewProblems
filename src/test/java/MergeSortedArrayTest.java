import org.example.MergeSortedArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeSortedArrayTest {

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



//Example 1:
//
//Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//Output: [1,2,2,3,5,6]
//Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
//        Example 2:
//
//Input: nums1 = [1], m = 1, nums2 = [], n = 0
//Output: [1]
//Explanation: The arrays we are merging are [1] and [].
//The result of the merge is [1].
//Example 3:
//
//Input: nums1 = [0], m = 0, nums2 = [1], n = 1
//Output: [1]
//Explanation: The arrays we are merging are [] and [1].
//The result of the merge is [1].
//Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
