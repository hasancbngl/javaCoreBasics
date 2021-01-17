package com.company;

public class NumberC<T extends Number> {
    //accepts only numbers
    T number;

    public NumberC(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }
}
