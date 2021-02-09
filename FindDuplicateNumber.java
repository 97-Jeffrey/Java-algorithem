package com.Jeffrey;

import java.util.HashMap;
public class FindDuplicateNumber {

    public static int solution(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++)
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);

        for(var key: map.keySet()){
            if(map.get(key) >1)
                return key;
        }
        return -1;
    }
}
