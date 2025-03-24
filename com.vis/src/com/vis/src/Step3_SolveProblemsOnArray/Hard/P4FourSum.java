package com.vis.src.Step3_SolveProblemsOnArray.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P4FourSum {
    public static void solve() {
        int[] nums = {1000000000,1000000000,1000000000,1000000000};
        List<List<Integer>> ans = fourSum(nums, -294967296);
        for(List<Integer> i:ans){
            System.out.println(i);
        }
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(i >0 && nums[i] == nums[i-1]){
                continue;
            }
            for(int j = i + 1;j<n;j++){
                if(j>i+1 && nums[j] == nums[j-1]){
                    continue;
                }
                int k = j+1;
                int l = n-1;
                while(k<l){
                    long sum = (long)nums[i] + (long)nums[j] + (long)nums[k] + (long)nums[l];
                    if(sum < target){
                        k++;
                    }
                    else if(sum > target){
                        l--;
                    }else{
                        ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        l--;
                        while(k<l && nums[k] == nums[k-1]){
                            k++;
                        }
                        while(k<l && nums[l] == nums[l+1]){
                            l--;
                        }
                    }
                }
            }
        }
        return ans;
    }
}
