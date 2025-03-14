package com.vis.src.Step3_SolveProblemsOnArray.Medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class P10LongestSubse {
    public static void solve(){
        int[] arr = {1,2,2,3,4,4,5};
        System.out.println(longestConsecutive(arr));
    }
    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int maxConsec = 1;
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }

        for(int i:set){
            int prev = i - 1;
            boolean isPrevFound = false;
            if(!set.contains(prev)){
                int curConsec = 1;
                int nextNum = i+1;
                while(set.contains(nextNum)){
                    curConsec++;
                    nextNum++;
                }
                maxConsec = Math.max(curConsec,maxConsec);
            }
        }
        return maxConsec;
    }
}
