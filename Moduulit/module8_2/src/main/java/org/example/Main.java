package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 5, 6, 7, 11, 12, 13, 16, 17, 19, 20, 23, 29, 42);

        System.out.println(list);

        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();
        System.out.println(avg);

        list = list.stream()
                .filter(number -> number % 2 != 0)
                .toList();

        System.out.println(list);

        list = list.stream()
                .map(number -> number * 2)
                .toList();

        System.out.println(list);

        int sum = list.stream()
                .reduce(0, Integer::sum);

        System.out.println(sum);

    }
}