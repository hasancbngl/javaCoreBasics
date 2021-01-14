package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {

        Message<String> message;

        message = (a)->{
            return a;
        };

        System.out.println(message.displayMessage("Hello Typeless lambda's interface"));

        Message<Integer> integerMessage;

        integerMessage = (n) ->{
            n = n*2;
            return n;
        };

        System.out.println(integerMessage.displayMessage(544545));



        System.out.println("----------");
       LambdasNotesE.lambda();

        NumbersI number;
        number = (a,b)-> 25*a + b;

        System.out.println(number.value(8,5));

    }
}
