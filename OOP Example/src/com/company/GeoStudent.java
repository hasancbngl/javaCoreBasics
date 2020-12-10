package com.company;

import java.util.Scanner;

public class GeoStudent extends EngineeringStudent {

    int geo;
    int algoritm;

    public GeoStudent(int geo,int algoritm) {
        this.geo=geo;
        this.algoritm = algoritm;
    }
    public GeoStudent(int geo) {
        this.geo=geo;
    }

    public GeoStudent( int geo, int algoritm,int id, int chem, int physics, int math) {
        super(id, chem, physics, math);
        this.geo = geo;
        this.algoritm = algoritm;
    }

    GeoStudent() {
        algoritm = 78;
        geo = 44;
    }

    void addGeoMArks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("add geo marks");
        geo = scanner.nextInt();
        System.out.println("add algorithm marks");
        algoritm = scanner.nextInt();
    }

    void displayGeoStudentMarks() {
        System.out.println("geo: " + geo);
        System.out.println("algorithm: " + algoritm);
    }

}
