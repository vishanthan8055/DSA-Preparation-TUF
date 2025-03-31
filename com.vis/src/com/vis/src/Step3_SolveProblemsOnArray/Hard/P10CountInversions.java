package com.vis.src.Step3_SolveProblemsOnArray.Hard;

import java.util.ArrayList;

public class P10CountInversions {
    public static void solve() {

    }
    public static int numberOfInversions(int []a, int n) {
        // Write your code here.
        return mergeSort(a,0,n-1);
    }
    public static int mergeSort(int[] arr, int s,int e){
        int cnt = 0;
        if(s >= e){
            return cnt;
        }
        int m = (s+e)/2;
        cnt += mergeSort(arr,s,m);
        cnt += mergeSort(arr,m+1,e);
        cnt += merge(arr,s,m,e);
        return cnt;
    }

    public static int merge(int[] arr, int s, int m, int e){
        int cnt = 0;
        int p1 = s;
        int p2 = m+1;
        ArrayList<Integer> temp = new ArrayList<>();
        while(p1<=m && p2 <=e){
            if(arr[p1]<=arr[p2]){
                temp.add(arr[p1]);
                p1++;
            }else{
                temp.add(arr[p2]);
                cnt += (m - p1 + 1);
                p2++;
            }
        }

        while(p1<=m){
            temp.add(arr[p1++]);
        }
        while(p2<=e){
            temp.add(arr[p2++]);
        }

        for(int i=s;i<=e;i++){
            arr[i] = temp.get(i - s);
        }
        return cnt;
    }
}
