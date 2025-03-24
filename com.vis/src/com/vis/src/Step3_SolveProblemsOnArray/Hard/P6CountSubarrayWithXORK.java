package com.vis.src.Step3_SolveProblemsOnArray.Hard;

import java.util.HashMap;

public class P6CountSubarrayWithXORK {
    public static void solve(){

    }
    public static int subarraysWithSumK(int []a, int b) {
        // Write your code here
        int count = 0;
        int ps = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i:a){
            ps ^= i;
            if(map.containsKey(ps ^ b)){
                count += map.get(ps ^ b);
            }

            if(map.containsKey(ps)){
                map.put(ps, map.get(ps)+1);
            }else{
                map.put(ps, 1);
            }
        }
        return count;
    }
}
