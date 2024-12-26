package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Epam2 {
    public static void main(String args){
        List<String> textList = Arrays.asList(
                "Java is a programming language.",
                "Python is another programming language.",
                "Java and Python are popular choices.");
        String targetWord = "Java";
        //output : 2
        System.out.println(textList.stream().flatMap(i -> Arrays.stream(i.split(" "))).filter(word -> word.equals(targetWord))
                .count());
    }
}
