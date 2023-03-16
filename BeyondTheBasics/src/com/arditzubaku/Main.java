package com.arditzubaku;

import java.awt.*;
import java.util.Arrays;

import java.lang.Math.*;

import static java.lang.Math.PI;
import static java.lang.Math.max;

public class Main {

        private static String brand = "Brand Global";
        public static String globalForEveryClass = "Global Value";
//    private static var brand = "Brand";
//    public static final String NAME = "Name";
//    public final static  String NAME2 = "Name";

    /*    public static final String MALE = "MALE";
        public static final String FEMALE = "FEMALE";*/
 /*   enum Gender {
        MALE,
        FEMALE
    }

    enum TShirtSize{
        S,
        M,
        L,
        XL
    }
*/

/*    static{
        System.out.println("Static initializer in main");
    }*/

    public static void main(String[] args) {
 /*       System.out.println("Program was given ");
        if (args.length > 0) {
            System.out.println("The following arguments: ");
            System.out.println(Arrays.toString(args));
        } else {
            System.out.println("0 arguments.");
        }*/

        // Type inference with var keyword
        // it can be used only for local variables
        /*String name = "Name";
        String[] names = {"Name1", "Name2"};
        int age = 20;
        boolean isTrue = true;
        double finance = 10_000_000.33;*/
    /*    var name = "Name";
        var names = new String[]{"Name1", "Name2"};
        var age = 20;
        var isTrue = true;
        var finance = 10_000_000.33;
        printBrand(name);*/

        //Break Keyword and Loops
    /*    var numbers = new int[]{1, 2, 3, 4, 5};
        for (var number : numbers) {
            if (number == 3) {
                break; // breaks the loops
            }
            System.out.println(number);
        }*/

        //Continue
  /*      var names = new String[]{"Test1", "Name1", "Name2", "Name3", "Test2"};
        for (var name : names) {
            if (name.startsWith("N")) {
                continue; // ends the iteration and continues to the next one
            }
            System.out.println(name);
        }*/

        //Final Keyword
/*        final var name = "Name";
//        name = "Name2";
        System.out.println(name);
        final Point p = new Point();
        p.x = 10;
        p.y = 90;
        p.y = 100;
        System.out.println(Math.PI);*/

        //Enums
       /* System.out.println(Gender.MALE);
        System.out.println(Gender.FEMALE);
        System.out.println(GenderConstants.FEMALE);
        System.out.println(GenderConstants.MALE);*/

        //Enum methods
/*        System.out.println(Gender.valueOf("MALE"));
//        System.out.println(Gender.valueOf("MALEs"));
        System.out.println(Arrays.toString(Gender.values()));
        for (var gender : Gender.values()) {
            System.out.println(gender);*/

        //Implicit and Explicit Type Casting
        // Type Casting - Convert one data type to another
        // Implicit Type (widening) Casting
        // Explicit Type (narrowing) Casting
/*        System.out.println("Implicit Type (widening) Casting");
        int balance = 10;
        double balanceInDouble = balance;
        System.out.println(balance);
        System.out.println(balanceInDouble);

        System.out.println("Explicit Type (narrowing) Casting");
        double remainingbalance = 100.5;
        int remainingBalanceInt = (int) remainingbalance;

        System.out.println(remainingbalance);
        System.out.println(remainingBalanceInt);*/

/*        //Global and local variables
        printBrand();

        String country = "England";
        String brand = "Brand local";
        System.out.println(brand);*/

/*        // Primitive Data Type Wrapper Class
        // allow us to use primitives as objects
        int age = 20;
        Integer ageInt = 20;
        System.out.println(ageInt.byteValue());
        Double price = 206.33;
        var ageStr = "55";
        System.out.println(Integer.parseInt(ageStr));
        System.out.println(Integer.min(1, 100));
        */

        // Static Initialization Block
//        new Person();
//        System.out.println(Person.count);

        // Instance Block Initializer
/*        Person testPerson = new Person();
        System.out.println();
        new Person();
        System.out.println(Person.count);
        System.out.println(testPerson.getFirstName());*/

        // Static imports
/*        System.out.println(PI);
        System.out.println(max(10,20));*/

        // Organizing the code
        // Packages
        // Domain/Model contain no business logic, allow you to store data.

        }

    public static void printBrand(/*String *//*var*//* brand*/) {
        System.out.println(brand);
//        System.out.println(country);
    }
}