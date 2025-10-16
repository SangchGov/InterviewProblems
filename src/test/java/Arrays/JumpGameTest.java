package Arrays;

import org.example.Arrays.JumpGame;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JumpGameTest {

    JumpGame jumpGame = new JumpGame();

    @Test
    void Test1(){

        int [] nums = {2,3,1,1,4};
        int k = jumpGame.jump(nums);

        Assertions.assertEquals(2,k);

    }

    @Test
    void Test2(){

        int [] nums = {2,3,0,1,4};
        int k = jumpGame.jump(nums);

        Assertions.assertEquals(2,k);

    }

    @Test
    void Test3(){

        int [] nums = {9, 5, 10, 2, 5, 7, 6, 1, 1, 5,
                5, 6, 1, 7, 7, 4, 4, 5, 8, 8,
                10, 3, 5, 8, 1, 2, 3, 6, 7, 2,
                9, 3, 1, 9, 10, 9, 2, 7, 3, 2,
                8, 4, 5, 9, 10, 6, 6, 10, 2, 0};
        int k = jumpGame.jump(nums);

        Assertions.assertEquals(7,k);

    }

}
