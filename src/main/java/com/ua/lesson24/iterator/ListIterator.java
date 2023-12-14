package com.ua.lesson24.iterator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListIterator implements CarIterator {
    private List<Car> cars;
    private int index;

    public ListIterator(List<Car> cars) {;
        this.cars = cars.stream()
                .sorted(Comparator.comparing(Car::getModel).reversed())
                .collect(Collectors.toList());
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < cars.size();
    }

    @Override
    public Car next() {
        if(hasNext()){
            Car item = cars.get(index);
            index++;
            return item;
        } else {
            return null;
        }
    }
}
