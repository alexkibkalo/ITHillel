package com.ua.lesson6.game;

public class RaceTrack {

    private int trackLength;
    private int[] carPositions;

    public RaceTrack(int length, int numberOfCars) {
        this.trackLength = length;
        this.carPositions = new int[numberOfCars];
    }

    public synchronized void moveCar(int carId, int distance){
        carPositions[carId] += distance;
    }

    public synchronized boolean isRaceFinished(){
        for (int i = 0; i < carPositions.length; i++) {
            if(carPositions[i] >= trackLength){
                return true;
            }
        }
        return false;
    }

    public synchronized void printInformation(){
        for (int i = 0; i < carPositions.length; i++) {
            System.out.println("Car " + i + " at position " + carPositions[i]);
        }
        System.out.println("--------------------------------------------------------------------------------");
    }
}
