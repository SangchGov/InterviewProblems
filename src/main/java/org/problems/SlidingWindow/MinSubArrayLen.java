package org.problems.SlidingWindow;

public class MinSubArrayLen {

    public int minSubArrayLen(int target, int[] nums) {

        int result = Integer.MAX_VALUE;
        int i;
        int left = 0;
        int sum = 0;


        for (i = 0; i < nums.length; i++){

            sum += nums[i];

            while (sum >= target) {

                result = Math.min(result , i - left + 1);
                sum -= nums[left++];

            }

        }



        if(result == Integer.MAX_VALUE){
            return 0;
        }else{
            return result;
        }
    }

}

//Topics
//premium lock icon
//        Companies
//Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray
// whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
//
//
//
//        Example 1:
//
//Input: target = 7, nums = [2,3,1,2,4,3]
//Output: 2
//Explanation: The subarray [4,3] has the minimal length under the problem constraint.
//Example 2:
//
//Input: target = 4, nums = [1,4,4]
//Output: 1
//Example 3:
//
//Input: target = 11, nums = [1,1,1,1,1,1,1,1]
//Output: 0
