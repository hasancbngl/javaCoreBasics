package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {



        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(230);
        arrayList.add(45);
        arrayList.add(25);

        //if type is not specified you can pass in any type.
        //if you specify gotta pass same parameter


        List<String> names = new ArrayList<>();
        names.add("jack");
        names.add("ki");
        names.add("kyoto");

        Test test = new Test(arrayList,names);

        test.printLists();

        Test.display(arrayList,names);


    }
}
