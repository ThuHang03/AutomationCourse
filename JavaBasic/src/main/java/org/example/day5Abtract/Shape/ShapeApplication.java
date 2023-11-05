package org.example.day5Abtract.Shape;

public class ShapeApplication {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setName("Circle");
        circle.radius = 4;
        circle.area();

        Square square = new Square();
        square.setName("Square");
        square.width = 3;
        square.high = 7;
        square.area();
    }
}
