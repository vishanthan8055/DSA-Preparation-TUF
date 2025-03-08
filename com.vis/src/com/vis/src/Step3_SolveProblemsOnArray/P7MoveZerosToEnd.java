package com.vis.src.Step3_SolveProblemsOnArray;

public class P7MoveZerosToEnd {
    public void moveZeroes(int[] nums) {
        if(nums.length == 1){
            return;
        }
        int l = 0, r = 1;
        while(r<nums.length){
            if(nums[l] != 0){
                l++;
                r++;
                continue;
            }
            if(nums[r] == 0){
                r++;
                continue;
            }
            swap(nums,l,r);
            l++;
            r++;
        }
    }
    public void swap(int[] nums, int x, int y){
        int t = nums[x];
        nums[x] = nums[y];
        nums[y] = t;
    }
}
