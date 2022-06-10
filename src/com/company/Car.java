package com.company;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Car {
    private int id;
    private int numberCar;

    @Override
    public String toString() {
        return "Car : " +
                "id = " + id +
                ", numberCar = " + numberCar;
    }
}
