package com.company;

import java.util.Scanner;

public class Tech extends Employee {
    double hourly_Wage;
    double hours;
    double salary;

    public void getSalary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total worked hours");
        this.hours = scanner.nextDouble();
        System.out.println("Enter total hourly wage");
        this.hourly_Wage = scanner.nextDouble();

        this.salary = this.hours*this.hourly_Wage;

        System.out.println("Salary Of Tech Employee " + name + ": " + this.salary );

    }
}
