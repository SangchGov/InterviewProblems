package org.problems.Arrays;

public class JumpGame {

    public int jump(int[] nums) {

        int end = 0;
        int best = 0;
        int k = 0;

        for (int i = 0; i < nums.length; i++) {

            best = Math.max(best, i + nums[i]);
            if (best >= nums.length - 1) {
                k++;
                break;
            }
            if (i == end) {
                k++;
                end = best;
            }

        }

        return k;
    }

}
