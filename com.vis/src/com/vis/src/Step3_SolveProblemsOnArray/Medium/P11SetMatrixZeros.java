package com.vis.src.Step3_SolveProblemsOnArray.Medium;

import java.util.Arrays;

public class P11SetMatrixZeros {
    public static void solve(){
        int[][] nums = {{1,1,1},{1,0,1},{1,1,1}};
        for(int[] i: nums){
            System.out.println(Arrays.toString(i));
        }
    }
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int col0 = 1;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    if(j == 0){
                        col0 = 0;
                    }else{
                        matrix[0][j] = 0;
                    }
                }
            }
        }

        for(int i = 1;i<m;i++){
            for(int j = 1;j<n;j++){
                if(matrix[i][j] != 0){
                    if(matrix[0][j] == 0 || matrix[i][0] == 0){
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        if(matrix[0][0] == 0){
            for(int j = 0;j<n;j++){
                matrix[0][j] = 0;
            }
        }
        if(col0 == 0){
            for(int i = 0;i<m;i++){
                matrix[i][0] = 0;
            }
        }
    }
}
