package com.vis.src.Step3_SolveProblemsOnArray.Medium;

import java.util.Arrays;
import java.util.HashMap;

public class P1TwoSum {
    public static void solve(){
        int[] nums = {3,2,4};
        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i){
                return new int[]{i, map.get(target- nums[i])};
            }
        }
        return new int[]{-1,-1};
    }
}
