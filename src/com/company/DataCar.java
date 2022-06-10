package com.company;
///      Дагы бир класс тузунуз, ал класста машинанын данныйлары сакталат
///     (год выпуска, модель, цена, цвет)
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor

public class DataCar {
    private int year;
    private String model;
    private int price;
    private String color;

    @Override
    public String toString() {
        return "DataCar : " +
                "year=" + year +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color;
    }
}
