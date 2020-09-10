package com;

import java.util.Scanner;

public class EquilibriumPointOfArray {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int numberOfTestCases = scanner.nextInt();

        for(int i= 0; i< numberOfTestCases; i++){
            int lengthOfArray = scanner.nextInt();
            int[] array = new int[lengthOfArray];
            int sum =0;
            for(int j=0; j< lengthOfArray; j++){
                array[j] = scanner.nextInt();
                sum = sum + array[j];
            }
            System.out.println(findEquilibrium(array, sum));
        }
    }

    public static int findEquilibrium(int[] array, int sum){
        if(array.length ==1){
            return 1;
        }
        else{
            int leftSum = 0;
            for(int i =1 ; i<array.length; i++){
                leftSum += array[i-1];
                sum -= array[i-1];
                if(leftSum == sum-array[i]){
                    return i+1;
                }
            }
        }
        return  -1;
    }
}
