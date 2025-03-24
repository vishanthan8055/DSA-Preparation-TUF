package com.vis.src.Step3_SolveProblemsOnArray.Hard;

import java.util.*;

public class P3ThreeSumEqualToZero {
    public static void solve(){
        int[] arr = {-1, -1, 2, 0, 1};
        List<List< Integer >> ans = triplet(arr.length,arr);
        for(List<Integer> i:ans){
            System.out.println(i);
        }
    }
    public static List<List< Integer >> triplet(int n, int []arr) {
        // Write your code here.
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if (i != 0 && arr[i] == arr[i - 1]) continue;
            int j = i + 1;
            int k = n-1;
            while(j<k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum<0){
                    j++;
                }else if(sum >0){
                    k--;
                }else{
                    ans.add(Arrays.asList(arr[i],arr[j],arr[k]));
                    j++;
                    k--;

                    while(j<k && arr[j] == arr[j-1]){
                        j++;
                    }
                    while(j<k && arr[k] == arr[k+1]){
                        k--;
                    }
                }
            }
        }
        return ans;
    }
    public static List<List< Integer >> tripletBrute(int n, int []arr) {
        // Write your code here.
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<n;i++){
            Set<Integer> tset = new HashSet<>();
            for(int j = i+1;j<n;j++){
                int k = -(arr[i]+arr[j]);
                if(tset.contains(k)){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(k);
                    Collections.sort(temp);
                    set.add(temp);
                }
                tset.add(arr[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
    }
}
