package com.vis.src.Step3_SolveProblemsOnArray.Medium;

public class P4KadaneAlgorithm {
    public static long maxSubarraySum(int[] arr, int n) {
        // write your code here
        long maxSum = Long.MIN_VALUE;
        long sum = 0;

        for(int i=0;i<n;i++){
            sum += arr[i];
            if(sum>maxSum){
                maxSum = sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        if(maxSum<0){
            maxSum = 0;
        }
        return maxSum;
    }
}
