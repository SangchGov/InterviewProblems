package org.problems.MultidimensionalDP;

import java.util.List;

public class MinimumTotal {

    public int minimumTotal(List<List<Integer>> triangle) {

        for(int i = triangle.size() - 2; i >= 0; i--){

            for (int j = 0; j < triangle.get(i).size() ; j++){

                int below = triangle.get(i + 1).get(j);
                int belowRight = triangle.get(i+1).get(j+1);

                int current = triangle.get(i).get(j);
                int newValue = current + Math.min(below, belowRight);

                triangle.get(i).set(j,newValue);

            }


        }

        return triangle.get(0).get(0);
    }



}
