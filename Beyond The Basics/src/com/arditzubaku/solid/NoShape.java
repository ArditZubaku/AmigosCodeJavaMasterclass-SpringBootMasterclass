package com.arditzubaku.solid;

public class NoShape implements IShape {
    @Override
    public double area() {
        throw new IllegalArgumentException("Can not calculate area.");
    }

/*    @Override
    public double volume() {
        return 0;
    }*/
}
