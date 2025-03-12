package com.vis.src.Step3_SolveProblemsOnArray.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P6RearrangeBySign {
    public static void solve(){
        int[] nums = {1,-2,-3,4,-3,-2};
//        System.out.println(Arrays.toString(rearrangeArray(nums)));
        System.out.println(Arrays.toString(alternateNumbers(nums)));
    }
    public static int[] rearrangeArray(int[] nums) {
        int positive = 0;
        int negative = 1;
        int n = nums.length;
        int[] ans = new int[n];

        for(int i = 0;i<n;i++){
            if(nums[i]<0){
                ans[negative] = nums[i];
                negative+=2;
            }
            else{
                ans[positive] = nums[i];
                positive+=2;
            }
        }
        return ans;
    }

    // variety - 2
    public static int[] alternateNumbers(int []a) {
        // Write your code here.
        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();

        for(int i:a){
            if(i<0){
                negatives.add(i);
            }
            else{
                positives.add(i);
            }
        }
        // Get Positives in positive list and negatives in negative list
        int m = positives.size();
        int n = negatives.size();

        // if less Positives more negatives
        // fill the array with positive and negative next to each other
        // after that fill the remaining in the ans array.
        if(m<n){
            for(int i = 0;i<m;i++){
                a[i*2] = positives.get(i);
                a[i*2+1] = negatives.get(i);
            }
            int idx = m*2;
            for(int i=m;i<n;i++){
                a[idx] = negatives.get(i);
                idx++;
            }
        }else{
            for(int i = 0;i<n;i++){
                a[i*2] = positives.get(i);
                a[i*2+1] = negatives.get(i);
            }
            int idx = n*2;
            for(int i=n;i<m;i++){
                a[idx] = positives.get(i);
                idx++;
            }
        }
        return a;
    }
}
