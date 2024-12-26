package com.sorting2024;

import com.sorrting.Common;

import java.util.Scanner;

public class CFG {
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
        if(start<end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void merge(int arr[], int start, int mid, int end){
        int[] temp = new int[end-start+1];
        int left =start;
        int right = mid+1;
        int index =0;

        while(left<=mid && right <=end){
            if(arr[left]<=arr[right]){
                temp[index] = arr[left];
                left++;
                index++;
            }
            else{
                temp[index] = arr[right];
                right++;
                index++;
            }
        }
        while (left<=mid){
            temp[index] = arr[left];
            left++;
            index++;
        }
        while (right<=end){
            temp[index] = arr[right];
            right++;
            index++;
        }

        //COpy back to original array
        for(int i=start; i<=end; i++){
            arr[i] = temp[i-start];
        }
    }

}
