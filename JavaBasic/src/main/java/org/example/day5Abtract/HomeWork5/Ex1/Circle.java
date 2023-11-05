package org.example.day5Abtract.HomeWork5.Ex1;

public class Circle extends Shape {
    public int radius;

    @Override
    public void area() {
        System.out.println(getName() + " : " + (3.14 * radius * 2));
    }
}
