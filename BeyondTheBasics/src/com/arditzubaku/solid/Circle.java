package com.arditzubaku.solid;

public class Circle implements IShape {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

/*    @Override
    public double volume() {
        return 0;
    }*/
}
