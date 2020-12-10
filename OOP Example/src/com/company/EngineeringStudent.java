package com.company;

import java.util.Scanner;

public class EngineeringStudent extends  Student{
    int math;

    public EngineeringStudent(int id, int chem, int physics, int math) {
        super(id, chem, physics);
        this.math = math;
    }

    public EngineeringStudent(int math) {
       this.math =math;
    }
    EngineeringStudent() {
        math = 83;
    }

    void addmathMArks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("add math marks");
        math = scanner.nextInt();
    }


    void displayMathMarks() {
        System.out.println("math: " + math);
    }
}
