package com.sorrting;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        bubbleSort(arr, length);
        Common.pintArray(arr);
    }

    public static void bubbleSort(int[] arr, int length) {
        for (int i = length - 1; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    Common.swap(arr, j, j + 1);
                }
            }
        }

    }
}
