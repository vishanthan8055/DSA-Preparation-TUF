package com.vis.src.Step3_SolveProblemsOnArray.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P1PascalsTriangleV3 {
    public static void solve(){
        int n  = 5;
        List<List<Integer>> ans = printPascalTriangle(n);
        for(List<Integer> i: ans){
            System.out.println(i);
        }
    }

    private static List<List<Integer>> printPascalTriangle(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < n;i++){
            ans.add(generateNthRow(i));
        }
        return ans;
    }

    private static ArrayList<Integer> generateNthRow(int r) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        long res = 1;
        for(int i = 0;i<r;i++){
            res = res * (r-i);
            res = res / (i+1);
            ans.add((int)res);
        }
        return ans;
    }

}
