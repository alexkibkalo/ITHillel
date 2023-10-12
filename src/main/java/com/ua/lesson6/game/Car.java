package com.ua.lesson6.game;

import java.util.Random;

public class Car implements Runnable {

    private int id;
    private RaceTrack track;

    public Car(int id, RaceTrack track) {
        this.id = id;
        this.track = track;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            int distance = random.nextInt(5) + 1;
            track.moveCar(id, distance);

            if(track.isRaceFinished()){
                System.out.println(id + " finished!");
                track.printInformation();
                break;
            }
            track.printInformation();
        }
    }

}
