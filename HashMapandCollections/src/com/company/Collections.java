package com.company;

import java.util.*;

public class Collections {
    public static ArrayList<String> friendsNames;

    public static void hashSetI() {
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(5);
        numbers.add(5);
        numbers.add(1);
        numbers.add(47);
        numbers.add(4);

        System.out.println(numbers.toString());

        for (int i = 1; i <= 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(i + " in the set.");
            } else {
                System.out.println(i + " not in the set.");
            }

        }
    }


    public static void linkedListE() {
        //or List<Integer> => List is an interface
        LinkedList<Integer>  myNumbers = new LinkedList<Integer>();
        Random random = new Random();
        int x=5;

        do {
            int y=random.nextInt(258) + 1;
            myNumbers.add(y);
            x--;
        }while (x!=0);

       printThem(myNumbers);

        LinkedList<Integer> luckyNumbers = new LinkedList<Integer>();
        luckyNumbers.add(23);
        luckyNumbers.add(0,45);
        luckyNumbers.add(84);
        luckyNumbers.add(21);

        myNumbers.addAll(luckyNumbers);
        printThem(myNumbers);
    }

    public static void printThem(LinkedList linkedList){
        System.out.print("[");

        Iterator iterator = linkedList.iterator();

        while (iterator.hasNext()) {
            System.out.print( iterator.next());
            if(iterator.hasNext()) System.out.print(",");
        }
        System.out.print("]");
        System.out.println("");
    }


    public static void example2() {
        Phone redMI = new Phone(1000,"RedMi 9", 2019, "android");
        Phone samsung = new Phone(1500,"S10", 2018, "android");
        Phone iphone = new Phone(4000,"Iphone 9", 2017, "Ios");

        ArrayList<Phone> phones = new ArrayList<Phone>();
        phones.add(redMI);
        phones.add(samsung);
        phones.add(iphone);

        for(int i=0;i<phones.size();i++) {
          //or   for(Phone p:phones)
            System.out.println("price: " + phones.get(i).getPrice() + " brand: " + phones.get(i).getBrand()
              + " year: " + phones.get(i).getYear() + " OStype: " + phones.get(i).getoSType());
        }
    }


    public static void arrayListExample() {
        friendsNames = new ArrayList<String>();
        friendsNames.add("Jack");
        friendsNames.add("Clı");
        friendsNames.add("Hasan");
       // friendsNames.remove(2);
        friendsNames.set(1,"django");

        Iterator iterator = friendsNames.iterator();
        //looping through
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
