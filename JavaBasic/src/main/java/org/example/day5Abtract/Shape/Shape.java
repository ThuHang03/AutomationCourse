package org.example.day5Abtract.Shape;

public abstract class Shape {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void area();
}
