package com;

import java.util.Scanner;

public class SubArrayWIthGivenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestcases = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for(int k =0; k<numberOfTestcases; k++)
        {

            String str = scanner.nextLine();
            int lkj= 5;
            String[] first2Params = str.split(" ");
            int[] params = new int[first2Params.length];
//            System.out.println(str);
            for(int i = 0; i< first2Params.length; i++){
                params[i] = Integer.parseInt(first2Params[i]);
            }
            String[] stringsArray = scanner.nextLine().split(" ");
            int[] array = new int[stringsArray.length];
            for(int i = 0; i< stringsArray.length; i++){
                array[i] = Integer.parseInt(stringsArray[i]);
            }
            System.out.println(findSubArrayWithGivenSum(array, params[1]));
        }

        scanner.close();
    }
    public static String findSubArrayWithGivenSum(int[] array, int sum){
        /**
         * O(n^2)
         */
//        for(int i=0; i<array.length; i++){
//            int count = array[i];
//            for(int j=i+1; j<array.length; j++){
//                count += array[j];
//                if(count==sum){
//                    return (i+1) + " " + (j+1);
//                }
//                if(count>sum){
//                    break;
//                }
//            }
//        }
//        return "-1";

        /**
         * O(n)
         */
        int header = 0;
        int count = 0;
        for(int i=0; i<array.length; i++){
            count += array[i];
            while(count>sum){
                count = count - array[header++];
            }
            if(count == sum){
                return (header+1) + " " + (i+1);
            }
        }
        return "-1";
    }
}
