package com.sorrting.recursion;

import com.sorrting.Common;

import java.util.Scanner;

public class QuickSort {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        quickSort(arr, 0, length-1);
        Common.pintArray(arr);
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int swapCount = low;
        for(int i=low; i<high; i++){
            if(arr[i] < pivot){
                Common.swap(arr,i, swapCount);
                swapCount++;
            }
        }
        Common.swap(arr, swapCount, high);
        return swapCount;
    }
}
