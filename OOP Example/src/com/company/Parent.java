package com.company;

import java.util.Random;

public class Parent {
        int wealth=100000545;
        int year = 2020;


        String dontInherit="its working";

        public  void displayString() {

            System.out.println("you are on the right track!");
        }

         void displayText() {
            System.out.println("That's a test parent class bit");
        }

        void randomNumber() {
            Random random = new Random();
            year = random.nextInt(850);
            System.out.println(year);
            System.out.println("method in parent class worked");
        }

}
