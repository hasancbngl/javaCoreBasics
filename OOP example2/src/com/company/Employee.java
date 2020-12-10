package com.company;

import java.util.Scanner;

public class Employee {

    int employeeId;
    String name;
    int age;
    Scanner scanner;

    public Employee(int employeeId,String name, int age) {
        this.employeeId = employeeId;
        this.name = name;
        this.age = age;
    }
    Employee() {
        employeeId=0;
        name="";
        age=0;
    }

    public void setData() {
        scanner = new Scanner(System.in);
        System.out.println("Please enter Employee Id: ");
        this.employeeId = scanner.nextInt();

        System.out.println("Enter employee name");
        this.name = scanner.next();

        System.out.println("Enter employee age");
        this.age = scanner.nextInt();
    }

    public void getData() {
        System.out.println("Employee id: " + this.employeeId + "  Employee name: " + this.name + "  Employee age: " + age );
    }


}
