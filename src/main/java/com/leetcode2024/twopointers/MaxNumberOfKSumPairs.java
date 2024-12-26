package com.leetcode2024.twopointers;

import java.util.Arrays;

public class MaxNumberOfKSumPairs {
    public static void main(String[] args) {
        int[] input = {1,8,6,2,5,4,8,3,7};
        int k = 5;
        System.out.println(maxNumberofKsumPairs(input, k));
    }
    public static int maxNumberofKsumPairs(int[] input, int k){
        Arrays.sort(input);
        int i =0, j= input.length-1, count =0;
        while(i<j){
            int sum = input[i] + input[j];
            if (sum == k){
                count++;
                input[i] =0;
                input[j] =0;
            }
            if( sum < k){
                i++;
            }
            else{j--;}
        }
        //Common.pintArray(input);
        return count;
    }
}
