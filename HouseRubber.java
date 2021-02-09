package com.Jeffrey;
import java.util.ArrayList;
public class HouseRubber {

    public static int rob(int[] nums){

        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];

        ArrayList<Integer> runningSum = new ArrayList<>();

        runningSum.add(nums[0]);
        runningSum.add(Math.max(nums[0], nums[1]));

        for(int i=2; i<nums.length; i++){
            runningSum.add(Math.max(runningSum.get(runningSum.size()-1), runningSum.get(runningSum.size()-2) + nums[i]));
        }

        return runningSum.get(runningSum.size()-1);
    }
}
