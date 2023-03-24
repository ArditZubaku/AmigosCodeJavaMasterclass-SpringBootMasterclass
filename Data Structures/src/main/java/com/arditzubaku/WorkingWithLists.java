package com.arditzubaku;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        List<String> immutableList = List.of(
                "Blue", "Yellow", "White"
        );
//        immutableList.add("Color");

//        List colors = new ArrayList();
        List<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Purple");
       /* colors.add(1);
        colors.add(new Object());*/

        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.contains("Yellow"));
        System.out.println(colors.contains("Blue"));

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        for (String color: colors) {
            System.out.println(color);
        }

        colors.forEach(System.out::println);
    }
}
