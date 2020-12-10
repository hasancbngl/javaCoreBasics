package com.company;

import java.util.Scanner;

public class HR extends Employee {

    double monthly_Wage;
    double months;
    double salary;


    public void getSalary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total month worked");
        this.months = scanner.nextDouble();
        System.out.println("Enter total monthly wage");
        this.monthly_Wage = scanner.nextDouble();

        this.salary = this.monthly_Wage*this.months;

        System.out.println("Salary Of HR Employee " + name + ": " + this.salary );

    }

}
