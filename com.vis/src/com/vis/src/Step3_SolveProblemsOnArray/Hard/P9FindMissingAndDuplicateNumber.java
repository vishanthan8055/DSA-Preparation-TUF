package com.vis.src.Step3_SolveProblemsOnArray.Hard;

import java.util.ArrayList;

public class P9FindMissingAndDuplicateNumber {
    public static void solve() {
        int[] arr = {4, 3, 6, 2, 1, 1};
        System.out.println(findTwoElement(arr));
    }
    static ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        long n = arr.length;

        long sum = 0;
        long sum2 = 0;
        long totSum = ((long) n * (n + 1)) / 2L;
        long totSum2 = (n * (n + 1) * (2L * n + 1)) / 6L;
        for(int i=0;i<n;i++){
            sum += arr[i];
            sum2 += (long)arr[i] * (long)arr[i];
        }
        long val1 = sum - totSum;
        long val2 = (sum2 - totSum2)/val1;

        long x = (val1 + val2)/2L;
        long y = -(sum - totSum - x);

        ans.add((int)x);
        ans.add((int)y);
        return ans;
    }
}
