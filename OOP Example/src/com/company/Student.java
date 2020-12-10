package com.company;

import java.util.Scanner;

public class Student {

    public int id;
    public int chem;
     int physics;


    //create constructer

    public Student(int id, int chem, int physics) {
        this.id = id;
        this.chem = chem;
        this.physics = physics;
    }
    public Student() {
        id = 8;
        chem = 90;
        physics = 74;
    }

    void addMArks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("add id and then chem marks");
        id = scanner.nextInt();
        chem = scanner.nextInt();
        System.out.println("add physics marks");
        physics = scanner.nextInt();
    }


     void displayPoints() {
        System.out.println("id: " + id);
        System.out.println("chemistry: " + chem);
        System.out.println("physics: " + physics);

    }


    /*
   public int id;
   public int phy;
   public int math;
   public int chem;
   private double sum;

    public Student(int id,int phy,int math,int chem) {
         this.id = id;
         this.phy = phy;
         this.math = math;
         this.chem = chem;
         sum = phy + math+ chem;
    }

    // you can create constructer to add defult value so no need pass values when object is created

     Student() {
         //System.out.println("constructer also working withoung initialization the values"); instance variables get default value (0)
         id = 0;
         phy = 0;
         math = 0;
         chem = 0;
         sum = 0;
    }

   Student() {
       id = 8;
       phy=92;
       math=-24;
       chem=-45*2+52;
       System.out.println("constructer executed!");
   }




    public double total () {
        return sum;
    }


    public double doTheMath () {

       return (sum)/3;
   }

   public static void displayAge() {
        System.out.println("age 2020");

   }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoint() {
        return Point;
    }

    public void setPoint(int point) {
        Point = point;
    }


 */
}
