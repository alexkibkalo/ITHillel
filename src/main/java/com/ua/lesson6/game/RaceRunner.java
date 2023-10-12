package com.ua.lesson6.game;

public class RaceRunner {
    public static void main(String[] args) {
        int raceLength = 15;
        int numberOfCars = 3;

        RaceTrack track = new RaceTrack(raceLength, numberOfCars);

        for (int i = 0; i < numberOfCars; i++) {
            Car car = new Car(i, track);
            new Thread(car).start();
        }

        Thread[] threads = new Thread[Thread.activeCount()];
        Thread.enumerate(threads);
        System.out.println(threads.length);
    }
}
