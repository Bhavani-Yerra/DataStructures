package com.walmart.ds;

import java.util.Arrays;

/**
 *   to  Everyone
 * Given an array of integers citations where citations[i] is the number of citations a researcher received for their ith paper, return the researcher's h-index.
 * The h-index is defined as the maximum value of h such that the given researcher has published at least h papers that have each been cited at least h times.
 * Input: citations = [3,0,6,1,5]
 * Output: 3
 * [3,0,6,1,5,8,4]
 * output : 4
 */
public class Test {
    public static void main(String args[]){
//        int[] citations = {3,0,6,1,5};
        int[] citations = {3,0,6,1,5,8,4};
        System.out.println(findTheHIndex(citations));
//        int[] citations = {3,0,6,1,5,8,4};
//        {0,1,3,5,6}
//        {0,1,5,6,8}
////        6 -0 > 0 - 0
////        6-1 > 1 - 1
////        6-2 > 3 -> 3
//                8 -> 1
//                6 -> 2
//                5 -> 3
////              1 -> 4
//                0 -> 5
//        (Len - current index) >= current value -> 2

    }

    public static int findTheHIndex(int[] citations){
        int length = citations.length -1;
        Arrays.sort(citations);
        int count =0;
        for(int i= citations.length-1; i>=0; i--){
            if(length-i <= citations[i])
                count++;
        }
        return count;
    }
}
/**
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 * Return the maximum amount of water a container can store.
 */
