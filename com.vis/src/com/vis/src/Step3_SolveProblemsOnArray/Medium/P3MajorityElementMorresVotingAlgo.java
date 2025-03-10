package com.vis.src.Step3_SolveProblemsOnArray.Medium;

public class P3MajorityElementMorresVotingAlgo {
    public static void solve(){
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        int ele = nums[0];
        int count = 1;
        for(int i = 1;i<nums.length;i++){
            if(count == 0) {
                ele = nums[i];
                count = 1;
            }else if(nums[i] == ele){
                count++;
            }else{
                count--;
            }
        }
        count = 0;
        for(int i:nums){
            if(i == ele){
                count++;
            }
        }
        if(count > nums.length/2){
            return ele;
        }else{
            return -1;
        }
    }
}
