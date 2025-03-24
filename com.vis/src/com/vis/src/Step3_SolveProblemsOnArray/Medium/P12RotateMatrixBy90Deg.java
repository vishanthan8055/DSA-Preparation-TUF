package com.vis.src.Step3_SolveProblemsOnArray.Medium;

import java.util.Arrays;

public class P12RotateMatrixBy90Deg {
    public static void solve(){
        int nums[][] = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(nums);
        for(int[] i:nums){
            System.out.println(Arrays.toString(i));
        }
    }
    public static void rotate(int[][] matrix) {
        transpose(matrix);
        rowreverse(matrix);
    }

    private static void transpose(int[][] matrix) {
        for(int i = 0;i<matrix.length;i++){
             for(int j = i;j< matrix.length;j++){
                 swapMatrix(i,j,matrix);
             }
        }
    }
    private static void rowreverse(int[][] matrix) {
        for(int[] i:matrix){
            reverseArray(i);
        }
    }
    private static void reverseArray(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        while(s<e){
            swap(nums,s,e);
            s++;
            e--;
        }
    }

    public static void swap(int[] nums, int x, int y){
        int t = nums[x];
        nums[x] = nums[y];
        nums[y] = t;
    }
    private static void swapMatrix(int i, int j, int[][] matrix) {
        int t = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = t;
    }

}
