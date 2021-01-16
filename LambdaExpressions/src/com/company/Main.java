package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numbers =new ArrayList<>();
        numbers.add(20);
        numbers.add(450);

        System.out.println(Test.multiplication(n-> {return n*3;}, 8));

        //System.out.println(Test.display((n)-> {return  n; }, "Thats it"));

        LambdasNotesE.lambda();


    }
}
