package com.company;

public class Car{

   private int maxSpeed = 100;
   private int minSpeed = 0;
   private double weight = 4079;

   private boolean isTheCarOn = false;
   private char condition = 'A';
   private String nameOfTheCar = "Rock";

   private double maxFuel = 16;
   private double currentFuel = 10;
   private double mpg = 22.8;
   private int peopleInTheCar = 2;

   //f(x,y,z) = y - x-2 / z;
   //f(x) = x+1;
   //x=5
   //f(5) = 5+1


   public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
       this.maxSpeed = customMaxSpeed;
       this.weight = customWeight;
       this.isTheCarOn = customIsTheCarOn;
   }



    public void printDetails() {
        System.out.println("max speed:" + maxSpeed);
        System.out.println("min speed:" + minSpeed);
        System.out.println("weight:" + weight);
        System.out.println("is the car on:" + isTheCarOn);
        System.out.println("condition:" + condition);
        System.out.println("name of the car:" + nameOfTheCar);
        System.out.println("number of people:" + peopleInTheCar);
    }

    public void upgradeMinSpeed() {
        minSpeed = maxSpeed;
        maxSpeed = 200;
    }

    public void getInTheCar() {
       peopleInTheCar++;
    }

    public void getOutOfTheCar() {
       peopleInTheCar--;
    }

    public double milesTillGasOut() {
       return mpg * currentFuel;
    }

    public double maxMilesPerFullFuel() {
       return maxFuel * mpg;
    }

}
