package com.arditzubaku.car;

public class CarDAO {
    public static final int CAPACITY = 100;
    private static final Car[] cars;
    private static int nextAvailableSlot = 0;

    static {
        cars = new Car[CAPACITY];
    }

    public void saveCar(Car car) {
        if (nextAvailableSlot + 1 >= CAPACITY) {
            // grow db
        }
        cars[nextAvailableSlot] = car;
        ++nextAvailableSlot;
    }

    public Car[] selectAllCars() {
        return cars;
    }
}
