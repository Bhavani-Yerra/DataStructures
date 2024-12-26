package com.testing;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Test {
    public static void main(String args[]){
        String[] sentences = {
                "Hello How are you.",
                "What is your name? wow",
                "Hi, where are you?",
                "when, why w?"
        };
        System.out.println(Arrays.stream(sentences).map(m -> m.split(" ")).flatMap(a -> Arrays.stream(a))
                .filter(x -> (x.startsWith("w") || x.startsWith("W"))).collect(Collectors.toList()));
    }
}
