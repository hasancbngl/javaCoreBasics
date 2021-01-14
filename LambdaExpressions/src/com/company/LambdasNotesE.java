package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class LambdasNotesE implements NumbersI{

    public static void lambda() {
        LinkedHashSet<String> wordS = new LinkedHashSet<>();

        wordS.add("Car");
        wordS.add("Laptop");
        wordS.add("Travel");
        wordS.add("Get it Done!");
        wordS.add("You're close");

        wordS.forEach((word)->{
            System.out.println(word);
        });

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(74);

        numbers.forEach((n)->{
            n=2*n-1;
            n--;
            System.out.println(n);
        });

    }

    public static void lambdaEx() {
        //parameter -> expression

    /*    NumbersI n;
        n = ()-> "hasan";

        System.out.println(n.displayName());*/

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach((a) -> {
            System.out.println(a);
        });


    }

  /*  @Override
    public int value(int a) {
        return a;
    } */

    @Override
    public int value(int a, int b) {
        return 0;
    }

    /*@Override
    public String displayName() {
        return null;
    }*/
}
