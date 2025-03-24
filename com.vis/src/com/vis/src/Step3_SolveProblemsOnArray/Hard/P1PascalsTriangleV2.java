package com.vis.src.Step3_SolveProblemsOnArray.Hard;

import java.util.ArrayList;

public class P1PascalsTriangleV2 {
    public static void solve(){
        int r  = 5;
        System.out.println(generateNthRow(r));
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
