package com.ua.lesson24.iterator;

import java.util.ArrayList;
import java.util.List;

public class CarList {
    private List<Car> cars = new ArrayList<>();

    public void add(Car car) {
        cars.add(car);
    }

    public CarIterator iterator(){
        return new ListIterator(cars);
    }
}
