package Arrays;

import org.problems.Arrays.Candy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CandyTest {

    Candy candy = new Candy();

    @Test
    void Test1(){

        int total = candy.candy(new int[]{1,0,2});

        Assertions.assertEquals(5, total);

    }

    @Test
    void Test2(){

        int total = candy.candy(new int[]{1,2,2});

        Assertions.assertEquals(4, total);

    }

}
