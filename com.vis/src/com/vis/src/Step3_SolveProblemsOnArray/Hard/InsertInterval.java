package com.vis.src.Step3_SolveProblemsOnArray.Hard;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {
    public static void solve() {
        int[][] arr = {{1,5}};
        int[] newInterval = {2,3};
        insert(arr,newInterval);
    }
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<List<Integer>> lst = new ArrayList<>();
        List<List<Integer>> ansList = new ArrayList<>();
        boolean isMerged = false;
        for(int[] i:intervals){
            if(newInterval[0] <= i[1] && !isMerged){
                if(newInterval[0]<=i[0]){
                    ArrayList<Integer> t =new ArrayList<>();
                    t.add(newInterval[0]);
                    t.add(newInterval[1]);
                    lst.add(t);
                    isMerged = true;
                }else{
                    ArrayList<Integer> t =new ArrayList<>();
                    t.add(i[0]);
                    t.add(i[1]);
                    lst.add(t);
                    t =new ArrayList<>();
                    t.add(newInterval[0]);
                    t.add(newInterval[1]);
                    lst.add(t);
                    isMerged = true;
                    continue;
                }
                ArrayList<Integer> t =new ArrayList<>();
                t.add(newInterval[0]);
                t.add(newInterval[1]);
                lst.add(t);
                isMerged = true;
            }
            ArrayList<Integer> t =new ArrayList<>();
            t.add(i[0]);
            t.add(i[1]);
            lst.add(t);
        }

        for(List<Integer> i:lst){
            if(ansList.isEmpty() || ansList.get(ansList.size()-1).get(1) < i.get(0)){
                ansList.add(Arrays.asList(i.get(0),i.get(1)));
            }else{
                int max = Math.max(ansList.get(ansList.size()-1).get(1), i.get(1));
                ansList.get(ansList.size()-1).set(1,max);
            }
        }

        if(!isMerged){
            ArrayList<Integer> t = new ArrayList<>();
            t.add(newInterval[0]);
            t.add(newInterval[1]);
            ansList.add(t);
        }
        int[][] finalArr = new int[ansList.size()][];
        int idx = 0;
        for(List<Integer> i:ansList){
            finalArr[idx++] = new int[]{i.get(0), i.get(1)};
        }
        return finalArr;
    }
}
