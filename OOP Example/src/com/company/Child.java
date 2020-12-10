package com.company;

import java.util.Random;

public class Child extends Parent {

    int number;


    void displayText() {
       // super.randomNumber();
        System.out.println("That's a test child class dudee");
    }

    public  void displayString() {


    }

    void randomNumber() {
        Random random = new Random();
        year = random.nextInt(850);
        System.out.println(year);
        System.out.println("method in child class worked");
    }
}