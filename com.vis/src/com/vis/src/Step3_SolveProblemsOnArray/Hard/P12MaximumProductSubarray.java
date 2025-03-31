package com.vis.src.Step3_SolveProblemsOnArray.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P12MaximumProductSubarray {
    public static void solve() {
        int[] nums = {2,3,-2,4};
        System.out.println(maxProduct(nums));
    }
    public static int maxProduct(int[] nums) {
        int prefixMul = 1;
        int suffixMul = 1;
        int maxi = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(prefixMul == 0) prefixMul = 1;
            if(suffixMul == 0) suffixMul = 1;

            prefixMul *= nums[i];
            suffixMul *= nums[n - i - 1];
            maxi = Math.max(maxi, Math.max(prefixMul, suffixMul));
        }
        return maxi;
    }
}
