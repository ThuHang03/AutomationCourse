package org.example.day5Abtract.HomeWork5.Ex1;

public class ShapeApplication {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setName("Circle");
        circle.radius = 4;
        circle.area();

        Square square = new Square();
        square.setName("Square");
        square.high = 5;
        square.area();
    }
}
