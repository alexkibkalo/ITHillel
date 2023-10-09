package com.ua.lesson5;

import com.ua.lesson5.agregation.HillelGroup;
import com.ua.lesson5.agregation.Student;
import com.ua.lesson5.composition.Car;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        HillelGroup group = new HillelGroup();
        group.setStudents(
                List.of(
                        new Student("Oleksandr"),
                        new Student("Maksim")
                )
        );
        System.out.println(group.getStudents());

        Car car = new Car("UGHBJKJ234324KJBKJN");
        System.out.println(car.getEngine());
    }
}
