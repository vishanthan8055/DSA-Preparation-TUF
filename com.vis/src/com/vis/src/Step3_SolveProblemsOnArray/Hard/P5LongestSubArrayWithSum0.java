package com.vis.src.Step3_SolveProblemsOnArray.Hard;

import java.util.HashMap;

public class P5LongestSubArrayWithSum0 {
    public static void solve(){
        int[] arr = {0,1,1,1};
        System.out.println(getLongestZeroSumSubarrayLength(arr));
    }
    public static int getLongestZeroSumSubarrayLength(int []arr){
        // Write your code here.
        int ps = 0;
        int n = arr.length;
        int maxLen = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            ps += arr[i];
            if(ps == 0) {
                maxLen = i + 1;
            }
            if(map.containsKey(ps)){
                maxLen = Math.max(maxLen, i - map.get(ps));
            }else{
                map.put(ps, i);
            }
        }
        return maxLen;
    }
}
