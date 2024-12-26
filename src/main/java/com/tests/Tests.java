package com.tests;

import java.util.function.Function;
import java.util.stream.Collectors;

public class Tests {

    public static void main(String args[]){
        int[] array = {1,5,2,3,1,5,8,6,5};

        System.out.println(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
