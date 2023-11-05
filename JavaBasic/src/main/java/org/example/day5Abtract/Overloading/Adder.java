package org.example.day5Abtract.Overloading;

public class Adder {
    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Adder add = new Adder();
        System.out.println(add.sum(2.3, 3.6));
        System.out.println(add.sum(2, 3));
    }
}
