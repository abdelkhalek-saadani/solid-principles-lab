package com.directi.training.srp.solution;

import java.util.Arrays;
import java.util.List;

public class CarFormatter
{
    private final _cars;

    public CarFormatter(List<Car> cars)
    {
        _cars = cars;
    }

    public String getCarsNames()
    {
        StringBuilder sb = new StringBuilder();
        for (Car car : _cars) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

}
