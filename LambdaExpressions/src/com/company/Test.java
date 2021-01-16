package com.company;

public class Test {
    //the method will accept lambda exp
    //pass the interface
   /*
    public static String display(TestInterface testInterface, String sentence) {
       return testInterface.test(sentence);
    }
    */

    public static int multiplication(TestInterface testInterface, int number) {
       return testInterface.multiplcation(number+5);
    }
}
