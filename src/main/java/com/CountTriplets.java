package com;

import java.util.Scanner;

public class CountTriplets {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int numberOfTestCases = scanner.nextInt();

        for(int i= 0; i< numberOfTestCases; i++){
            int lengthOfArray = scanner.nextInt();
            int[] array = new int[lengthOfArray];
            for(int j=0; j< lengthOfArray; j++){
                array[j] = scanner.nextInt();
            }
            System.out.println(findCountTriplets(array));
        }
    }

    private static int findCountTriplets(int[] array) {
        int firstPointer =0;
        int count =0;
        int length = array.length;
        int secondPointer = length-2;
        for(firstPointer = 0;firstPointer<length-2;firstPointer++){
            if(array[firstPointer] + array[secondPointer] == array[length-1]){
                count++;
                firstPointer++;
                secondPointer--;
            }
        }

        return -1;
    }
}
