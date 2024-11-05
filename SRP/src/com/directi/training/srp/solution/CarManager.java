package com.directi.training.srp.solution;

import java.util.Arrays;
import java.util.List;

public class CarManager
{
    public Car getBestCar()
    {
        Car bestCar = null;
        CarRepository carRepo = new CarRepository();
        
        for (Car car : carRepo.getAllFromDb()) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
