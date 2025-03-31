package com.vis.src.Step3_SolveProblemsOnArray.Easy;

public class SortedAndRotated {
    public static void solve() {
        int[] nums = {5,5,6,6,6,9,1,2};
        System.out.println(check(nums));
    }
    public static boolean check(int[] nums) {
        int n = nums.length;
        int pivot = -1;
        for(int i = 0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                pivot = i+1;
                break;
            }
        }
        if(pivot == -1){
            int x = 0;
            while(x+1 < n){
                if(nums[x] > nums[x+1]){
                    return false;
                }
            }
            return true;
        }
        int x = pivot;
        while(x+1 < n){
            if(nums[x]>nums[x+1]){
                return false;
            }
            x++;
        }
        if(nums[n-1] > nums[0]){
            return false;
        }
        x = 0;
        while(x+1 < pivot){
            if(nums[x]>nums[x+1]){
                return false;
            }
            x++;
        }
        return true;
    }
}
