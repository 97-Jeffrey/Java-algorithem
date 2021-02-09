package com.Jeffrey;

import java.util.Arrays;

public class KthLargest {

    public static int solution(int[] nums, int k){

        Arrays.sort(nums);
        return nums[nums.length - k];

    }
}
