package com.arditzubaku;

import java.util.Arrays;

public class WorkingWithArrays {
    public static void main(String[] args) {

        String[] colors = new String[5];
        colors[0] = "Purple";
        colors[1] = "Blue";

        System.out.println(Arrays.toString(colors));
        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);
//        System.out.println(colors[5]);

        colors[2] = "Yellow";
        colors[2] = "Red";
        System.out.println(colors[2]);

       /* int[] numbers = new int[2];
        numbers[0] = 100;
        numbers[1] = 200;*/
        int[] numbers = {100,200};

        System.out.println(colors.length);

        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        for (int i = colors.length - 1; i >= 0; i--) {
            System.out.println(colors[i]);
        }

        for (String color : colors) {
            System.out.println(color);
        }

        Arrays.stream(colors).forEach(System.out::println);








    }
}
