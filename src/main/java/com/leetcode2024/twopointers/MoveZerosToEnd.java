package com.leetcode2024.twopointers;

import com.sorrting.Common;

/**
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Note that you must do this in-place without making a copy of the array.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Example 2:
 *
 * Input: nums = [0]
 * Output: [0]
 */
public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroInPlace(nums);
        Common.pintArray(nums);
    }
    public static void moveZeroInPlace(int[] nums){
        int start =0;
        int end = 0;
        while (end<nums.length && start<nums.length){
            if(nums[start]!=0){
                start++;
                end++;
            }
            else if(nums[start] ==0 && nums[end]!=0){
                Common.swap(nums, start, end);
                start++; end++;
            }
            else end++;
        }
    }
    public  static void rotateArray(int start, int[] nums, int end){
//         [0,1,0,3,12]

    }
}
