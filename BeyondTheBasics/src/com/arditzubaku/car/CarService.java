package com.arditzubaku.car;

public class CarService {

//    private CarDAO carDAO = new CarDAO();
    private CarDAO carDAO;

    public CarService() {
        this.carDAO = new CarDAO();
    }

    public int registerNewCar(Car car){
        // check if car is not null
        // check if reg number is valid
        // etc
        return 1;
    }

    public Car[] getCars(){
        return carDAO.selectAllCars();
    }
}
