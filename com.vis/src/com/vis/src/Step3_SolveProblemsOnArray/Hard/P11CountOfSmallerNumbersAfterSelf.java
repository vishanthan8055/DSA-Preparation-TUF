package com.vis.src.Step3_SolveProblemsOnArray.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class DataPlusIndex{
    public int data;
    public int index;

    public DataPlusIndex(int data, int index) {
        this.data = data;
        this.index = index;
    }
}
public class P11CountOfSmallerNumbersAfterSelf {

    public  void solve() {
        int[] nums = {5,2,6,1};
        int[] ans = new int[nums.length];
        DataPlusIndex[] arr = new DataPlusIndex[nums.length];
        for(int i = 0;i<nums.length;i++){
            arr[i] = new DataPlusIndex(nums[i],i);
        }
        mergeSort(arr, 0, nums.length-1,ans);
        List<Integer> al = new ArrayList<>();
        for(int i:ans){
            al.add(i);
        }
        System.out.println(al);
    }
    public  void mergeSort(DataPlusIndex[] arr, int s,int e, int[] ans){
        if(s >= e){
            return;
        }
        int m = (s+e)/2;
        mergeSort(arr, s, m, ans);
        mergeSort(arr, m+1, e, ans);
        merge(arr,s,m,e, ans);
    }

    public  void merge(DataPlusIndex[] arr, int s, int m , int e, int[] ans){
        int p1 = s;
        int p2 = m+1;
        ArrayList<DataPlusIndex> temp = new ArrayList<>();
        while(p1<=m && p2 <= e){
            if(arr[p1].data<=arr[p2].data){
                temp.add(arr[p1++]);
            }else{
                int idx = arr[p1].index;
                ans[idx] += p2 - (m + 1);
                temp.add(arr[p2++]);
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
