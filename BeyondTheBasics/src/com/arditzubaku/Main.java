package com.arditzubaku;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program was given ");
        if (args.length > 0) {
            System.out.println("The following arguments: ");
            System.out.println(Arrays.toString(args));
        } else {
            System.out.println("0 arguments.");
        }
    }
}