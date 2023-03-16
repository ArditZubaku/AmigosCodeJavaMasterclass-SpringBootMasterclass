package com.arditzubaku.solid;

import java.util.List;

public class AreaCalculatorV2 implements IAreaCalculator {
    @Override
    public int sum(List<IShape> IShapes) {
        int sum = 0;
        for (int i = 0; i < IShapes.size(); i++) {
            sum += IShapes.get(i).area();
     /*       if (shape instanceof Square) {
                sum += Math.pow(((Square) shape).getLength(), 2);
            }
            if (shape instanceof Circle) {
                sum += Math.PI * Math.pow(((Circle) shape).getRadius(), 2);
            }
            // Breaks the rule of OCP
            if (shape instanceof Cube) {
               // code
            }*/
        }

        return sum;
    }

    // Excessive functionality - breaks the rule of single responsibility
/*    public String json(List<Object> shapes){
        return "{sum: %s}".formatted(sum(shapes));
    }

    public String csv(List<Object> shapes){
        return "sum,%s".formatted(sum(shapes));
    }*/
}
