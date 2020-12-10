package com.company;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Tech techEmployee = new Tech();
        techEmployee.setData();
        techEmployee.getData();
        techEmployee.getSalary();

        System.out.println("////////////////////////////////");

        HR hrEmp = new HR();
        hrEmp.setData();
        hrEmp.getData();
        hrEmp.getSalary();

        Design designEmployee = new Design();
       designEmployee.setData();
       designEmployee.getData();
       designEmployee.getSalary();

        System.out.println("////////////////////////////////");

/*

     Employee employee = new Employee();
        employee.setData();
        employee.getData();


        int r;


        Programmer programmer = new Programmer("djnago",3,4500);
        programmer.name="hasan";
        programmer.id=2;
        programmer.salary=3500;

        System.out.println("name: " + programmer.name+" id: " + programmer.id + " salary: " + programmer.salary);
        System.out.println("***********************************");

        System.out.println("Plese enter raious value");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextInt();
        Circle circle = new Circle(r);

        System.out.println("area of the circle: " + String. format("%.2f",  circle.getArea()));
        System.out.println("area of the circle: " + String. format("%.2f",  circle.getPerimeter()));  */  }
}
