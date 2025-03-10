package com.vis.src.Step3_SolveProblemsOnArray.Medium;

public class P2SortArr012DutchNationalFlag {
    public static void sortColors(int[] nums) {
        int l = 0, m = 0, h = nums.length-1;
        while(m<=h){
            if(nums[m] == 0){
                swap(nums,l,m);
                l++;
                m++;
            }else if(nums[m] == 1){
                m++;
            }else if(nums[m] == 2){
                swap(nums,m,h);
                h--;
            }
        }
    }
    public static void swap(int[] nums, int x, int y){
        int t = nums[x];
        nums[x] = nums[y];
        nums[y] = t;
    }
}
