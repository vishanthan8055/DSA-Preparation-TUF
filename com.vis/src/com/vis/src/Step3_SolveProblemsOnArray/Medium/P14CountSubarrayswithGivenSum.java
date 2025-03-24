package com.vis.src.Step3_SolveProblemsOnArray.Medium;

import java.util.HashMap;

public class P14CountSubarrayswithGivenSum {
    public static void solve(){

    }
    public static int subarraySum(int[] nums, int k) {
        int count = 0 ;
        int prefixSum = 0;
        HashMap<Integer,Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0,1);
        for(int i:nums){
            prefixSum += i;
            int diff = prefixSum - k;
            if(prefixSumMap.containsKey(diff)){
                count += prefixSumMap.get(diff);
            }
            if(prefixSumMap.containsKey(prefixSum)){
                prefixSumMap.put(prefixSum,prefixSumMap.get(prefixSum)+1);
            }else{
                prefixSumMap.put(prefixSum,1);
            }
        }
        return count;
    }
}
