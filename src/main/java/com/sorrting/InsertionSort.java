package com.sorrting;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        insertionSort(arr, length);
        Common.pintArray(arr);
    }

    public static void insertionSort(int[] arr, int length){
        for(int i= 1 ; i< length; i++){
            for(int j=0; j<i; j++){
                if(arr[j]>arr[i]){
                    Common.swap(arr, i, j);
                    Common.pintArray(arr);
                    System.out.println();
                }
            }
        }
    }
}
