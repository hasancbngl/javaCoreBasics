package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Collections {
    public static ArrayList<String> friendsNames;

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

class Phone{
    int price;
    String brand;
    int year;
    String oSType;

    public Phone(int price, String brand, int year, String oSType) {
        this.price = price;
        this.brand = brand;
        this.year = year;
        this.oSType = oSType;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getoSType() {
        return oSType;
    }

    public void setoSType(String oSType) {
        this.oSType = oSType;
    }
}
