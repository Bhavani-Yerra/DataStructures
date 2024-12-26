package com.leetcode2024.twopointers;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] containerHeight = {1,8,6,2,5,4,8,3,7};
        System.out.println(findMaxAreaOfContainer(containerHeight));
    }
    public static int findMaxAreaOfContainer(int[] heights){
        int i =0, j= heights.length-1;
        int maxArea =0;
        while(i<j){
            int currentArea = Math.min(heights[i], heights[j]) * (j-i);
            if (currentArea > maxArea){
                maxArea = currentArea;
            }
            if( heights[i] == Math.min(heights[i], heights[j])){
                i++;
            }
            else{j--;}
        }
        return maxArea;
    }
}
