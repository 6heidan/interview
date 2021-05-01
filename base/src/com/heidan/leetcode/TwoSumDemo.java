package com.heidan.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSumDemo {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 17;
        int[] myIndex = twoSum2(nums, target);

        for (int element : myIndex) {
            System.out.println(element);
        }
    }

    //遍历------暴力破解
    public static int[] twoSum1(int[] nums,int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j=i+1;j<nums.length;j++){
                if (target-nums[i] == nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    public static int[] twoSum2(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int partnerNumber = target - nums[i];
            if (map.containsKey(partnerNumber)){
                return new int[]{map.get(partnerNumber),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
