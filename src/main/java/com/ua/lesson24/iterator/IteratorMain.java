package com.ua.lesson24.iterator;

public class IteratorMain {
    public static void main(String[] args) {
        CarList cars = new CarList();
        cars.add(new Car("Audi", 10000));
        cars.add(new Car("BMW", 10000));

        CarIterator iterator = cars.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
