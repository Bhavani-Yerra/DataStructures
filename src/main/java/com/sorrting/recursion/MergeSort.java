package com.sorrting.recursion;

import com.sorrting.Common;

import java.util.Scanner;

public class MergeSort {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        mergeSort(arr, 0, length-1);
        Common.pintArray(arr);
    }

    public static void mergeSort(int[] arr, int start, int end){
        if (start < end) {
            int mid = (start+end)/2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void merge(int[] arr, int start, int mid, int end){
        int[] tempArr = new int[end-start+1];
        int left = start;
        int right = mid+1;
        int temp = 0;

        while (left<=mid && right<=end){
            if(arr[left] >= arr[right]){
                tempArr[temp] = arr[right];
                temp++;
                right++;
            }
            else {
                tempArr[temp] = arr[left];
                temp++;
                left++;
            }
        }

        while(left<=mid){
            tempArr[temp] = arr[left];
            temp++;
            left++;
        }

        while (right<=end){
            tempArr[temp] = arr[right];
            temp++;
            right++;
        }

        // copy temp to original interval
        for(int i = start; i <= end; i ++) {
            arr[i] = tempArr[i - start];
        }

    }
}
