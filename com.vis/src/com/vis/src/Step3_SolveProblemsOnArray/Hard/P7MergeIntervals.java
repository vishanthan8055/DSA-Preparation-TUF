package com.vis.src.Step3_SolveProblemsOnArray.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P7MergeIntervals {
    public static void solve() {
        int[][] intervals = {{1,4}, {0,0}};
        int[][] ans = merge(intervals);
        for(int[] i: ans){
            System.out.println(Arrays.toString(i));
        }
    }
    public static int[][] merge(int[][] intervals) {
        ArrayList<List<Integer>> ansList = new ArrayList<>();
        Arrays.sort(intervals, (a, b) ->
                a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0])
        );
        for(int[] i:intervals){
            if(ansList.isEmpty() || ansList.get(ansList.size()-1).get(1) < i[0]){
                ansList.add(Arrays.asList(i[0],i[1]));
            }else{
                int max = Math.max(ansList.get(ansList.size()-1).get(1), i[1]);
                ansList.get(ansList.size()-1).set(1,max);
            }
        }
        int[][] ans = new int[ansList.size()][];
        int ite = 0;
        for(List<Integer> i: ansList){
            ans[ite] = new int[]{i.get(0),i.get(1)};
            ite++;
        }
        return ans;
    }
}
