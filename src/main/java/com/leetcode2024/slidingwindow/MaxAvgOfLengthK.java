package com.leetcode2024.slidingwindow;

public class MaxAvgOfLengthK {
        public static void main(String[] args) {
            int[] input = {1,12,-5,-6,50,3};
            int k = 4;
            System.out.println(maxAvgOfLengthK(input, k));
        }
        public static double maxAvgOfLengthK(int[] input, int k){
//            int i=0;
//            double maxAvg = Integer.MIN_VALUE;
//            double avg = 0;
//            if(input.length == 1){
//                return input[0];
//            }
//            while(i <= (input.length -k)){
//                double sum =0;
//               for(int j =0; j<k; j++){
//                   sum = sum + input[i+j];
//               }
//               avg = sum/k;
//                if(avg > maxAvg) maxAvg = avg;
//                i++;
//            }
//            return maxAvg;
            int startIndex = 0;
            int endIndex = k;
            double sum = 0;
            for (int i=0; i<k; i++){
                sum += input[i];
            }
            double maxSum = sum;
            while(endIndex < input.length){
                sum = sum - input[startIndex];
                startIndex++;

                sum = sum + input[endIndex];
                endIndex++;

                maxSum = Math.max(sum, maxSum);
            }
            return maxSum/k;
        }
}
