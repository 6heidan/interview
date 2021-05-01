package com.heidan.datastructure;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {15,65,35,95};
        System.out.println(binarySearch(nums, 95));
    }

    public static int binarySearch(int[] nums,int target){
        int left = 0;
        int right = nums.length-1;

        while (left<=right){
            int mid = (left+right)/2;
            if (nums[mid]==target){
                return mid;
            }else if (target>nums[mid]){
                left = mid+1;
            }else if(target<nums[mid]){
                right = mid-1;
            }
        }
        return -1;
    }
}
