package com.company;

public class Test<T,A>{
    T value;
    A value2;

    public Test(T value, A value2) {
        this.value = value;
        this.value2 = value2;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
    public A getValue2() {
        return value2;
    }
    public void setValue2(A value2) {
        this.value2 = value2;
    }

    public void printLists() {
        System.out.println(getValue() + " " + getValue2());
    }

    public static<B,C> void display(B value, C value2) {
        System.out.println(value + " " + value2);
    }

}
