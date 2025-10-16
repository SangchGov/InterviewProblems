package Arrays;

import org.example.Arrays.RotateArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RotateArrayTest {

    private final RotateArray rotateArray = new RotateArray();

    @Test
    void Test1(){

        int [] nums = {1,2,3,4,5,6,7};
        int k = 3;

        rotateArray.rotate(nums,k);

        Assertions.assertArrayEquals(new int[]{5,6,7,1,2,3,4}, nums);

    }

    @Test
    void Test2(){

        int [] nums = {-1,-100,3,99};
        int k = 2;

        rotateArray.rotate(nums,k);

        Assertions.assertArrayEquals(new int[]{3,99,-1,-100}, nums);

    }


}



