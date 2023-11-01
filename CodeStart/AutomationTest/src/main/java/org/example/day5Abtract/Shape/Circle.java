package org.example.day5Abtract.Shape;

public class Circle extends Shape {
    public int radius;

    @Override
    public void area() {
        System.out.println(getName() + " : " + 3.14 * radius * radius);
    }
}
