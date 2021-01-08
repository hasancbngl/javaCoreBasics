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
   private int maxNumberOfPeopleInTheCar = 6;

    public Car() {

    }

   public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
       this.maxSpeed = customMaxSpeed;
       this.weight = customWeight;
       this.isTheCarOn = customIsTheCarOn;
   }

   public int getMaxSpeed() {
        return this.maxSpeed;
   }
   public void  setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
   }

   public int getMinSpeed(){
        return  this.minSpeed;
   }
   public void  setMinSpeed(int minSpeed) {
        this.minSpeed = minSpeed;
   }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isTheCarOn() {
        return isTheCarOn;
    }

    public void setTheCarOn(boolean theCarOn) {
        isTheCarOn = theCarOn;
    }

    public char getCondition() {
        return condition;
    }

    public void setCondition(char condition) {
        this.condition = condition;
    }

    public String getNameOfTheCar() {
        return nameOfTheCar;
    }

    public void setNameOfTheCar(String nameOfTheCar) {
        this.nameOfTheCar = nameOfTheCar;
    }

    public double getMaxFuel() {
        return maxFuel;
    }

    public void setMaxFuel(double maxFuel) {
        this.maxFuel = maxFuel;
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

    public void upgradeMaxSpeed() {
      setMaxSpeed(getMaxSpeed() +10);
    }
    

    public void getInTheCar() {
        if(peopleInTheCar<maxNumberOfPeopleInTheCar) {
        peopleInTheCar++;
            System.out.println("someone got in");
        } else {
            System.out.println("The car is full " + peopleInTheCar + "=" + maxNumberOfPeopleInTheCar);
        }

    }

    public void getOutOfTheCar() {
        if(peopleInTheCar>0) {
            peopleInTheCar--;
            System.out.println("people in the car: " + peopleInTheCar);
        }
        else {
            System.out.println("No one is in the car: " + peopleInTheCar);
        }
    }

    public void turnTheCarOn() {
        if(!isTheCarOn) {
            isTheCarOn = true;
        }
        else {
            System.out.println("The car is already on!");
        }
    }

    public double milesTillGasOut() {
       return mpg * currentFuel;
    }

    public double maxMilesPerFullFuel() {
       return maxFuel * mpg;
    }

}
