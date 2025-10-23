package MultiDP;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.problems.MultidimensionalDP.MinimumTotal;

import java.util.ArrayList;
import java.util.List;

public class MinimumTotalTest {

    MinimumTotal minimumTotal = new MinimumTotal();

    @Test
    void test1() {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<>(List.of(2)));
        triangle.add(new ArrayList<>(List.of(3, 4)));
        triangle.add(new ArrayList<>(List.of(6, 5, 7)));
        triangle.add(new ArrayList<>(List.of(4, 1, 8, 3)));

        Assertions.assertEquals(11, minimumTotal.minimumTotal(triangle));
    }

}
