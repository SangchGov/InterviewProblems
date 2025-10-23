package Arrays;

import org.problems.Arrays.RemoveElement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveElementTest {

    @Test
    void removeElementTest(){
        int [] nums = {3, 2, 2, 3};
        int result = RemoveElement.removeElement(nums, 3);
        assertEquals(2,result);
        assertArrayEquals(new int[]{2, 2}, java.util.Arrays.copyOf(nums, result));
    }

    

}
