package org.example.day5Abtract.HomeWork5.Ex1;

public class Square extends Shape {
    public int high;

    @Override
    public void area() {
        System.out.println(getName() + " : " + high * 4);
    }
}
