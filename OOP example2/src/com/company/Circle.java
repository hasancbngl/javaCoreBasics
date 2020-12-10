package com.company;

public class Circle {

    int r;
    double pi;

    public Circle(int r) {
        pi=3.14;
        this.r = r;
    }

    public double getArea() {
        double area=pi*r*r;

        return area;
    }

    public double getPerimeter() {
        double perimeter=2*pi*r;
        return perimeter;
    }


}
