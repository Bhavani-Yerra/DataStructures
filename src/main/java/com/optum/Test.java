package com.optum;

/**
 * Student name, marks
 * if <33 -> Student - Marks
 * > 33 -> Student - nearest multiple of 5.(61,62 -> 60, 63,64 -> 65)
 * */

public class Test {
    public static void main(String[] args) {
        printMarks(33);
    }
    public static void printMarks(int marks){
        if(marks <=33)
            System.out.println(marks);
        else if(marks %5 == 2 || marks %5 ==1){
            System.out.println(marks - marks%5);
        }
        else
            System.out.println(marks + (5-marks%5));
    }
}
