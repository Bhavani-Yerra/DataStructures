package com.testing;

/**
 * Given N steps having positive integers which signifies the cost of the
 * moving from each step. Paying the cost at i-th step, you can either climb
 * one or two steps. Given that one can start from the 0-the step or 1-the step,
 * the task is to find the minimum cost to reach the top of the floor(N+1) by climbing N(maximum) step.
 * Examples:
 * Input: a[] = { 15, 21, 11, 10, 18 }
 * Output: 31
 * 21->10
 * Start from 21 and then move to 10.
 * Input: a[] = {2, 7, 4, 2, 7, 5, 9}
 * Output: 13
 * 2->4->2->5
 * has context menu
 */
public class Test2 {
    public  static void main(String args[]){
        int[] input = { 15, 21, 11, 10, 18 };
        int weight1 = 0;
        int i = input.length;
        int weight2 = 0;
        int j=input.length-1;
//        while(i> 0){
//            weight = weight + Math.min(input[i-1], input[i-2]);
//            System.out.println(Math.min(input[i-1], input[i-2]) + " ->");
//            if(Math.min(input[i-1], input[i-2])==input[i-1]){
//                i = i-1;
//            }
//            else i = i-2;
//        }
        while (i>0 && j>1){
            weight1 = weight1+ Math.min(input[i-1], input[i-2]);
            if(Math.min(input[i-1], input[i-2])==input[i-1]){
                i = i-1;
            }
            else i = i-2;
            weight2 = weight2 + Math.min(input[j-1], input[j-2]);
            if(Math.min(input[j-1], input[j-2])==input[j-1]){
                j = j-1;
            }
            else j = j-2;
        }
        System.out.println("Weight is " + Math.min(weight1, weight2));
    }
}
