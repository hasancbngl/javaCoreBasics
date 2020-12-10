package com.company;

import java.util.Scanner;

public class BioStudent extends Student {
    int biology;

    public BioStudent(int id, int chem, int physics, int biology) {
        super(id, chem, physics);
        this.biology = biology;
    }

    public BioStudent() {
      biology = 82;
    }
    public BioStudent(int biology) {
        this.biology = biology;
    }

    void addBioMArks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("add biology marks");
        biology = scanner.nextInt();
    }


    void displayBioMarks() {
        System.out.println("Biology: " +biology);
    }
}
