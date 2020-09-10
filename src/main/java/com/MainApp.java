package com;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @link https://www.hackerrank.com/challenges/sparse-arrays/problem
 */
public class MainApp {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int stringCount = scanner.nextInt();

        List<String> strings = IntStream.range(0, stringCount).mapToObj(i -> scanner.next()).collect(Collectors.toList());
        IntStream.range(0, scanner.nextInt()).mapToObj(i -> scanner.next()).mapToLong(j -> strings.stream().filter(j::equals).count()).forEach(System.out::println);
    }
}
