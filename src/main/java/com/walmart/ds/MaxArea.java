package com.walmart.ds;

public class MaxArea {
    public static void main(String args[]) {
        int[] citations = {1,8,6,2,5,4,8,3,7};
//        int[] citations = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(citations));
    }
    public static int maxArea(int[] arr){
        int start_index =0;
        int end_index = arr.length-1;
        int max_area = 0;
        int area =0;

        while(start_index!=end_index){
            int min_height = Math.min(arr[start_index], arr[end_index]);
            area = (end_index - start_index) * min_height;
            if(area > max_area){
                max_area = area;
            }
            if(min_height == arr[start_index]){
                start_index++;
            }
            else end_index--;
        }
        return max_area;
    }
}
