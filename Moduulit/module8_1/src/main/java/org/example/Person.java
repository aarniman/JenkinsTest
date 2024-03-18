package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Person {
    private String name, city;
    private int age;

    public Person(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Name: " + name + ", City: " + city + ", Age: " + age;
    }
}

class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", "New York", 25));
        persons.add(new Person("Jane", "Helsinki", 32));
        persons.add(new Person("Tom", "London", 45));
        persons.add(new Person("Alice", "Paris", 28));
        persons.add(new Person("Bob", "London", 35));

        persons.sort(Comparator.comparingInt(Person::getAge));

        System.out.println("Persons sorted by age:");
        persons.forEach(System.out::println);

        String filter = "London";

        persons.removeIf(person -> !person.getCity().equals(filter));

        System.out.println("Persons from " + filter + ":");
        persons.forEach(System.out::println);
    }
}


