package org.example;

import java.util.List;

public class Numbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 5, 8, 20, 15, 3, 12);

        System.out.println("Numbers:");
        numbers.forEach(System.out::println);

        numbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .toList();

        System.out.println("\nOdd numbers:");
        numbers.forEach(System.out::println);

        numbers = numbers.stream()
                .map(number -> number * 2)
                .toList();

        System.out.println("\nDoubled numbers:");
        numbers.forEach(System.out::println);

        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("\nSum of the numbers: " + sum);

    }

}

