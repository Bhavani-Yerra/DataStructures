package com.optum;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,3,25,98,73,78};
        System.out.println("Minimum value is : " + findMin(intArray));
        System.out.println("Maximum value is : " + findMax(intArray));
    }

    public static int findMin(int[] array){
        int minimum = Integer.MAX_VALUE;
        for(int i =0; i< array.length; i++){
            if(minimum > array[i]){
                minimum = array[i];
            }
        }
        return minimum;
    }

    public static int findMax(int[] array){
        int maximum = Integer.MIN_VALUE;
        for(int i =0; i< array.length; i++){
            if(maximum < array[i]){
                maximum = array[i];
            }
        }
        return maximum;
    }
}
