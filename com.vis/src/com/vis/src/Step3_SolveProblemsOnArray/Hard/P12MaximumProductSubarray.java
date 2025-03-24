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
        long prod = 1;
        long maxProd = Integer.MIN_VALUE;
        for(int i:nums){
            prod *= i;
            maxProd = Math.max(maxProd,prod);
            if(prod <= 0){
                prod = 1;
            }
        }
        return (int)maxProd;
    }
}
