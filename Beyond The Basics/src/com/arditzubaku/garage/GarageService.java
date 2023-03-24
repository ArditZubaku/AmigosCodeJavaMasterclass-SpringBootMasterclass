package com.arditzubaku.garage;

import com.arditzubaku.car.Car;

public class GarageService {

    // business logic
    public boolean addToCarGarage(Car car, Garage garage) {

        if (car == null) {
            throw new IllegalArgumentException(
                    "Car can not be null"
            );
        }
        int count = 0;
        for (Car c : garage.getCars()) {
            if (c != null) {
                count++;
            }
        }
        //add car to garage
        return garage.getCapacity() < count;
    }
}
