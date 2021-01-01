package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Car tomsCar =new Car(280,98.78,true);
        System.out.println("Tom's car v1");
        tomsCar.printDetails();

        tomsCar.getInTheCar();
        System.out.println("max miles: " + tomsCar.maxMilesPerFullFuel());
        System.out.println("miles left: " + tomsCar.milesTillGasOut());

        System.out.println("Tom's car v2");
        tomsCar.printDetails();
        tomsCar.getInTheCar();
        tomsCar.getInTheCar();
        tomsCar.getInTheCar();

        tomsCar.getOutOfTheCar();
        tomsCar.getInTheCar();
        tomsCar.turnTheCarOn();


    }
}
