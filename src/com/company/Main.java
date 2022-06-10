package com.company;
//      Car деген класс тузунуз (Id, номер авто)
//      Дагы бир класс тузунуз, ал класста машинанын данныйлары сакталат
//      (год выпуска, модель, цена, цвет)
//      HashMap тузунуз ключ - машина, маани - машинанын данныйлары
//      HashMap ти толтуруп кайра entrySet деген методун колдонуп баардык
//      элементтерин консольго чыгарыныз.

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HashMap<Car, DataCar> map = new HashMap<>();
        Car car = new Car(1, 536);
        Car car2 = new Car(2, 123);
        Car car3 = new Car(3, 456);
        DataCar dataCar = new DataCar(2001, "Odissey", 3000, "White");
        DataCar dataCar2 = new DataCar(2010, "Mercedes-Benz", 5000, "White");
        DataCar dataCar3 = new DataCar(2020, "Tesla", 7000, "Black");

        map.put(car, dataCar);
        map.put(car2, dataCar2);
        map.put(car3, dataCar3);


        for (Map.Entry a:map.entrySet()) {
            System.out.println(a.getKey()+" "+a.getValue());
        }
    }
}
