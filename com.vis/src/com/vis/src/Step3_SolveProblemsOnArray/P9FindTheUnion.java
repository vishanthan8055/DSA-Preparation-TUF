package com.vis.src.Step3_SolveProblemsOnArray;

import java.util.ArrayList;
import java.util.HashMap;

public class P9FindTheUnion {
    public static void solve(){
        int[] a = {-8,-3,-3,-2,0,1,2,2,6};
        int[] b = {-9,-9,0};
        System.out.println(findUnion(a,b));
    }
    //Optimal Without Using Map -> Using Our ans List we can Say if the Element exist or not
    // How? Simple, We always Enter the smallest elements in each iteration and if we want to check if a number
    // Already exist or not, we can simply check the last number is = to the Current number.
    // IF yes, already there so we ignore,
    // IF not, We can say its not there, Because, before to the last elements will have only the smallest numbers than current number.
    // NICE!!!
        public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        int l = 0, r = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        while(l < a.length && r < b.length){
            int x = a[l];
            int y = b[r];

            if(x == y){
                if(ans.isEmpty()){
                    ans.add(x);
                }
                else if(ans.get(ans.size()-1) != x){
                    ans.add(x);
                }
                l++;
                r++;
            }else{
                if(x < y){
                    if(ans.isEmpty()){
                        ans.add(x);
                    }
                    else if(ans.get(ans.size()-1) != x){
                        ans.add(x);
                    }
                    l++;
                }
                else{
                    if(ans.isEmpty()){
                        ans.add(y);
                    }
                    else if(ans.get(ans.size()-1) != y){
                        ans.add(y);
                    }
                    r++;
                }
            }
        }
        while(l<a.length){
            if(ans.isEmpty()){
                ans.add(a[l]);
            }
            else if(ans.get(ans.size()-1) != a[l]){
                ans.add(a[l]);
            }
            l++;
        }
        while(r<b.length){
            if(ans.isEmpty()){
                ans.add(b[r]);
            }
            else if(ans.get(ans.size()-1) != b[r]){
                ans.add(b[r]);
            }
            r++;
        }
        return ans;
    }

    //BRUTE USING SPACE(Map) to Avoid Duplicates
//    public static ArrayList<Integer> findUnion(int a[], int b[]) {
//        // add your code here
//        int l = 0, r = 0;
//        ArrayList<Integer> ans = new ArrayList<>();
//        HashMap<Integer,Integer> map = new HashMap<>();
//
//        while(l < a.length && r < b.length){
//            int x = a[l];
//            int y = b[r];
//
//            if(x == y){
//                if(!map.containsKey(x)){
//                    map.put(x,1);
//                    ans.add(x);
//                }
//                l++;
//                r++;
//            }else{
//                if(x < y){
//                    if(!map.containsKey(x)){
//                        map.put(x,1);
//                        ans.add(x);
//                    }
//                    l++;
//                }
//                else{
//                    if(!map.containsKey(y)){
//                        map.put(y,1);
//                        ans.add(y);
//                    }
//                    r++;
//                }
//            }
//        }
//        while(l<a.length){
//            if(!map.containsKey(a[l])){
//                map.put(a[l],1);
//                ans.add(a[l]);
//            }
//            l++;
//        }
//        while(r<b.length){
//            if(!map.containsKey(b[r])){
//                map.put(b[r],1);
//                ans.add(b[r]);
//            }
//            r++;
//        }
//        return ans;
//    }
}
