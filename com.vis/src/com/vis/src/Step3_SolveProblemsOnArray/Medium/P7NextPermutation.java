package com.vis.src.Step3_SolveProblemsOnArray.Medium;

import java.util.Arrays;

public class P7NextPermutation {
    public static void solve(){
        int[] arr = {2,1,5,4,3,0,0};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void nextPermutation(int[] nums) {
        int pivot = -1;
        int n = nums.length;
        for(int i = n - 2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot = i;
                break;
            }
        }
        if(pivot == -1){
            reverseArray(nums,0,n-1);
        }else{
            int nextMax = pivot+1;
            for(int i = pivot+1;i<n;i++){
                if(nums[i]>nums[pivot] && nums[nextMax]>=nums[i]){
                    nextMax = i;
                }
            }
            swap(nums, pivot, nextMax);
            reverseArray(nums,pivot+1,n-1);
        }
    }

    private static void reverseArray(int[] nums, int s, int e) {
        while(s<e){
            swap(nums,s,e);
            s++;
            e--;
        }
    }
    private static void swap(int[] nums, int a, int b) {
        int t = nums[a];
        nums[a] = nums[b];
        nums[b] = t;
    }
}
