package com.vis.src.Step3_SolveProblemsOnArray;

import java.util.ArrayList;
import java.util.Arrays;

public class P91 {
    public static void solve(){
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        int l = 0, r = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> al = new ArrayList<>();
        while (l < nums1.length && r < nums2.length) {
            int x = nums1[l];
            int y = nums2[r];
            if(x == y ){
                if(al.isEmpty() || (!al.isEmpty() && al.get(al.size() - 1) != x) ){
                    al.add(x);
                }
                l++;
                r++;
            }else if(x<y){
                l++;
            }else{
                r++;
            }
        }
        int[] ans = new int[al.size()];
        for(int i=0;i<al.size();i++){
            ans[i] = al.get(i);
        }
        return ans;
    }
}
