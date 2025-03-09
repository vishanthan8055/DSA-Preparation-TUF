package com.vis.src.Step3_SolveProblemsOnArray;

public class P13LongestSubArrWithSumK {
    public static void solve(){
        int[] arr = {1,2,1,3};
        System.out.println(longestSubarrayWithSumK(arr, 2));

    }
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        int l = 0, r = 0, maxLen = 0, sum = 0;

        while(r < a.length){
            sum += a[r];
            while(l <= r && sum > k){
                sum -= a[l];
                l++;
            }
            if(sum == k){
                maxLen = Math.max(maxLen,r-l+1);
            }
            r++;
        }
        return maxLen;
    }
}
