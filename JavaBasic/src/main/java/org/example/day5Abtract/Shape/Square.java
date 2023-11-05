package org.example.day5Abtract.Shape;

public class Square extends Shape {
    public int high;
    public int width;

    @Override
    public void area() {
        System.out.println(getName() + " : " + high * width);
    }
}
