package com.arditzubaku.solid;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IAreaCalculator areaCalculator = new AreaCalculator();
        IAreaCalculator areaCalculatorV2 = new AreaCalculatorV2();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube();
        Rectangle rectangle = new Rectangle();
        IShape noIShape = new NoShape();
        List<IShape> shapes = List.of(circle, square, cube, rectangle/*, noShape*/);
        int sum = areaCalculator.sum(shapes);
//        System.out.println("Sum = " + sum);
       /* System.out.println(areaCalculator.json(shapes));
        System.out.println(areaCalculator.csv(shapes));*/
        ShapesPrinter printer = new ShapesPrinter(areaCalculator);
        ShapesPrinter printer2 = new ShapesPrinter(areaCalculatorV2);
        System.out.println(printer.json(shapes));
        System.out.println(printer.csv(shapes));
    }
}
