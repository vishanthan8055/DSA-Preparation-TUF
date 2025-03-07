package com.vis.src.Step3_SolveProblemsOnArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P6LeftRotateArrayByDPlaces {
    public static int[] nums = {1,2,3,4,5,6,7};
    public static int k = 3;

    public static void run(){
//        rotate(nums,k);
//        System.out.println(Arrays.toString(nums));

        ArrayList<Integer> list = new ArrayList<>();
        for(int i:nums){
            list.add(i);
        }

        System.out.println(rotateArray(list, k));
    }
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        reverse(nums,0,n-1);
    }

    private static void reverse(int[] nums, int s, int e) {
        while(s < e){
            int t = nums[s];
            nums[s] = nums[e];
            nums[e] = t;
            s++;
            e--;
        }
    }

    //Naukri
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        int n = arr.size();
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
        return arr;
    }
    public static void reverse(ArrayList<Integer> arr, int s, int e) {
        while(s < e){
            int t = arr.get(s);
            arr.add(s,arr.get(e));
            arr.remove(s+1);
            arr.add(e,t);
            arr.remove(e+1);
            s++;
            e--;
        }
    }
}
