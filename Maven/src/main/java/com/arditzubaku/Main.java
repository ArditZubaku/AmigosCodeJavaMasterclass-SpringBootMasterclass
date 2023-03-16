package com.arditzubaku;

import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Maven!");
        Faker faker = new Faker();
//        System.out.println(faker.name());
        System.out.println(faker.name().name());
        System.out.println(faker.name().firstName());
        System.out.println(faker.name().lastName());
//        System.out.println(faker.address());
//        System.out.println(faker.address().cityName());
//        System.out.println(faker.address().city());

    }
}