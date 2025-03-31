package com.vis.src.Step3_SolveProblemsOnArray.Hard;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void solve() {
        int[] arr = {9,1,2,8,5,6,3,7,4};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr, int s,int e){
        if(s >= e){
            return;
        }
        int m = s + (e-s)/2;
        mergeSort(arr,s,m);
        mergeSort(arr,m+1,e);
        merge(arr,s,m,e);
    }

    public static void merge(int[] arr, int s, int m, int e){
        int p1 = s;
        int p2 = m+1;
        ArrayList<Integer> temp = new ArrayList<>();
        while(p1<=m && p2 <=e){
            if(arr[p1]<arr[p2]){
                temp.add(arr[p1]);
                p1++;
            }else{
                temp.add(arr[p2]);
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
    }
}
