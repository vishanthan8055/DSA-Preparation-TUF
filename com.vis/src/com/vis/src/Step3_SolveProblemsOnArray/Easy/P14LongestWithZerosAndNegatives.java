package com.vis.src.Step3_SolveProblemsOnArray.Easy;

import java.util.HashMap;

public class P14LongestWithZerosAndNegatives {
    public static int getLongestSubarray(int []nums, int k) {
        // Write your code here.
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int sum = 0;
        int maxLen = 0;
        for(int i=0;i<n;i++){
            sum += nums[i];
            if(sum == k){
                maxLen = Math.max(maxLen,i+1);
            }

            if(map.containsKey(sum - k)){
                maxLen = Math.max(maxLen, i - map.get(sum-k));
            }

            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxLen;
    }
}
