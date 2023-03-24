package com.arditzubaku.solid;

public class Cube implements IShape, I3DShape {
    @Override
    public double area() {
        return 100;
    }

    @Override
    public double volume() {
        return 250;
    }

/*    @Override
    public double volume() {
        return 0;
    }*/
}
