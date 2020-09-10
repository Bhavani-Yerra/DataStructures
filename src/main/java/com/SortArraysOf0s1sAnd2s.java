package com;

import java.util.Scanner;

public class SortArraysOf0s1sAnd2s {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestcases = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for(int k =0; k<numberOfTestcases; k++)
        {

            int  length = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            String[] stringsArray = scanner.nextLine().split(" ");
            int[] array = new int[stringsArray.length];
            int count = 0;
            int sum = 0;
            for(int i = 0; i< stringsArray.length; i++){
                array[i] = Integer.parseInt(stringsArray[i]);
                if(array[i] == 2){
                    count ++;
                }
                sum = sum + array[i];
            }
            int[] sortedArray = new int[length];
            for(int j=length-count; j< length;j++){
                sortedArray[j] = 2;
            }
            int l = 0;
            int zeros = length-count-(sum-(2*count));
            while( l<(sum-(2*count))){
                sortedArray[length-count-l-1] = 1;
                l++;
            }
//            int m = 0;
//            while (m < zeros){
//                sortedArray[m] = 0;
//                m++;
//            }

            for(int x =0 ; x<length-1 ; x++){
                System.out.print(sortedArray[x] + " ");
            }
            System.out.println(sortedArray[length-1]);

        }

        scanner.close();
    }
}
