package com.arditzubaku.nullPointerEx;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
/*        var brand = "Brand";
//        System.out.println(brand.toUpperCase());
        Animal animal = new Animal("Animal");*/
//        String brand = null;
     /*   try {
            System.out.println(brand.toUpperCase());
        }catch (NullPointerException e){
            System.out.println("Brand is null");
        }*/

//        String brand = "Brand";
        String brand = null;
        Optional<String> brandOptional = Optional.ofNullable(brand);
        System.out.println(brandOptional.isEmpty());

 /*       if (brandOptional.isEmpty()) {
            System.out.println("Brand is empty.");
        } else {
            System.out.println(brandOptional.get());
        }*/

        // same thing achieved
        brandOptional.ifPresentOrElse(
                b -> System.out.println(b.toUpperCase()),
                () -> System.out.println("Brand is empty.")
        );

        var result = brandOptional.orElse("If it is null print this otherwise print its value.");
        System.out.println(result);
    }

    public static void printInUpperCase(String input) {
//        Objects.requireNonNull(input, "Input can not be null!");
        System.out.println(input.toUpperCase());
    }

    static class Animal {
        private final String name;

        public Animal(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
