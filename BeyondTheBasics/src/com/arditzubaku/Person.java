package com.arditzubaku;

public class Person {
    public static int count;

    // Static Initialization Block - used only with static fields, methods, etc.
    static {
        System.out.println("Start: static initialization");
        count = 10;
        test();
        System.out.println("End: static initialization");
    }

    public static void test() {
        System.out.println("Static method - test");
    }

    private String firstName;
    private String lastName;
    private Gender gender;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Person() {
        System.out.println("Default constructor");
        count++;
    }

    public Person(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }
}
