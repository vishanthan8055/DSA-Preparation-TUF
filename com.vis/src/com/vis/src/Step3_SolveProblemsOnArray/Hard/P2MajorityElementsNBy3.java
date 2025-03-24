package com.vis.src.Step3_SolveProblemsOnArray.Hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P2MajorityElementsNBy3 {
    public static void solve(){

    }
    public static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;
        int cnt1 = 0, cnt2 = 0;
        for(int i = 0;i<nums.length;i++){
            if(cnt1 == 0 && ele2 != nums[i]) {
                ele1 = nums[i];
                cnt1 = 1;
            }else if(cnt2 == 0 && ele1 != nums[i]) {
                ele2 = nums[i];
                cnt2 = 1;
            }
            else if(nums[i] == ele1){
                cnt1++;
            }else if(nums[i] == ele2){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;
        for(int i:nums){
            if(i == ele1){
                cnt1++;
            }
            if(i == ele2){
                cnt2++;
            }
        }
        int mini = (int)(n / 3) + 1;
        if (cnt1 >= mini) ans.add(ele1);
        if (cnt2 >= mini) ans.add(ele2);
        Collections.sort(ans);
        return ans;
    }
}
