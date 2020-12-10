package com.company;

import java.util.Scanner;

public class Design extends Employee {
    double weekly_Wage;
    double weeks;
    double salary;


    public void getSalary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total worked weeks");
        this.weeks = scanner.nextDouble();
        System.out.println("Enter total weekly wage");
        this.weekly_Wage = scanner.nextDouble();

        this.salary = this.weeks*this.weekly_Wage;

        System.out.println("Salary Of Design Employee " + name + ": " + this.salary );

    }


}
