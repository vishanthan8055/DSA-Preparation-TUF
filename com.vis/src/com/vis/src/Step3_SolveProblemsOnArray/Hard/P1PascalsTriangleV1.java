package com.vis.src.Step3_SolveProblemsOnArray.Hard;

public class P1PascalsTriangleV1 {
    public static void solve(){
        int r = 5, c = 3;
        System.out.println(nCr(r-1,c-1));
    }
    public static int nCr(int n, int r){ // n = 7 r = 4
        long res = 1;
        for(int i = 0; i<r;i++){
            res = res * (n-i);  // 7....6....5
            res = res / (i+1);  // 1....2....3
        }
        return (int) res;
    }
}
