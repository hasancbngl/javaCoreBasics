package com.company;

public class Vehicle implements Car{

    @Override
    public void drive() {
        System.out.println("you're on the way to your goal!");
    }

    @Override
    public void stop() {
        System.out.println("Stop and take a break when you arrived!");
    }

    @Override
    public void speed() {
        int speed=100;
        System.out.println("Current speed is " + speed + "km/h");
    }
}
