package com.leetcode2024.slidingwindow;

public class MaxConsecutiveOnes {
        public static void main(String[] args) {
            int[] input = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
            int k = 3;
            System.out.println(maxConsecutiveOnes(input, k));
        }
        public static int maxConsecutiveOnes(int[] input, int k){
            int startIndex = 0;
            int endIndex = 0;
            int count = 0;
            int length = 0;
            int maxLength = length;
            while(startIndex < input.length-maxLength && endIndex<input.length){
                if(count > k ){
                    count =0;
                    //length =endIndex - startIndex -1;
                    startIndex ++;
                    endIndex = startIndex;
                    length =0;
                    continue;
                }
                if (input[endIndex] ==0) {count++;length++;}
                else length++;
                endIndex++;
                maxLength = Math.max(length, maxLength);
            }
            return maxLength;
        }
}
