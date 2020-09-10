package com.sorrting;

import java.util.Scanner;

/**
 * Complexity - O(n^2)
 * Worst case complexity : O(n2)
 * Average case complexity (Basic version) : O(n2)
 */
public class SelectionSort {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        selectionSort(arr, length);
        Common.pintArray(arr);
    }

    public static void selectionSort(int[] arr, int length){
        for(int i = 0; i< length; i++){
            for(int j=length-1; j>i;j--){
                if(arr[i] > arr[j]) {
                    Common.swap(arr, i, j);
                }
            }
        }
    }


}
