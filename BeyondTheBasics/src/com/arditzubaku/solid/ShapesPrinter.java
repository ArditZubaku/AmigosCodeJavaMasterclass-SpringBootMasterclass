package com.arditzubaku.solid;

import java.util.List;

public class ShapesPrinter {

    private final IAreaCalculator areaCalculator;

    public ShapesPrinter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    public String json(List<IShape> shapes) {
        return "{shapesSum: %s}".formatted(areaCalculator.sum(shapes));
    }

    public String csv(List<IShape> shapes) {
        return "shapes_sum,%s".formatted(areaCalculator.sum(shapes));
    }
}