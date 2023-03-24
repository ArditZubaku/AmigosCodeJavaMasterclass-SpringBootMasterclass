package com.arditzubaku.car;

import com.arditzubaku.email.EmailService;
import com.arditzubaku.mot.MOTService;

public class CarService {

    private CarDAO carDAO;
    private EmailService emailService;
    private MOTService motService;
    // Bad practices
/*//    private CarDAO carDAO = new CarDAO();

    public CarService() {
        this.carDAO = new CarDAO();
    }*/

    // Dependency injection


    public CarService(CarDAO carDAO, EmailService emailService, MOTService motService) {
        this.carDAO = carDAO;
        this.emailService = emailService;
        this.motService = motService;
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
