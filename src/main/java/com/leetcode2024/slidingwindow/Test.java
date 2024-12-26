package com.leetcode2024.slidingwindow;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void main(String args[]) {
        List<String> fruits =
                Arrays.asList(null, "apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");
        //expected  output
//        Map<String, Long> countMap;
//    List<String> fruitList =
        fruits.stream()
                .filter(fruit -> (fruit != null && (fruit.startsWith("a") || fruit.startsWith("o"))))
                .forEach(System.out::println);
//            .collect(Collectors.toList());
//        System.out.println(fruits.stream()
//                .filter(fruit -> (fruit != null && (fruit.startsWith("a") || fruit.startsWith("o")))).


//                .mapToLong((fruit -> fruits.stream().filter(fr -> fruit.equalsIgnoreCase(fr)).count()))
//                .count());

    }

}
