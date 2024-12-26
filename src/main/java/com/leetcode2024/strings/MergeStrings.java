package com.leetcode2024.strings;

public class MergeStrings {
    public static void main(String args[]){
        String input1 = "abcdef";
        String input2 = "pqr";
        System.out.println(mergeStrings(input1,input2));
    }

    public static String mergeStrings(String input1, String input2){
        char[] mergeString = new char[input1.length() + input2.length()];
        int minLength = Math.min(input1.length(), input2.length());
        int maxLength = Math.max(input1.length(), input2.length());
        int index = 0;
        for(int i=0; i<minLength; i++){
            mergeString[index++] = input1.charAt(i);
            mergeString[index++] = input2.charAt(i);
        }
        for(int i=minLength; i<maxLength; i++){
            if(input1.length() == maxLength){
                mergeString[index++] = input1.charAt(i);
            }
            if(input2.length() == maxLength){
                mergeString[index++] = input2.charAt(i);
            }
        }
        return String.valueOf(mergeString);
    }
}
