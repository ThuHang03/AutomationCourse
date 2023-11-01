package org.example.day4.Homework4;

import java.text.DecimalFormat;
import java.util.Random;

public class Employee {
    private int id;
    private String name;
    private int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        Random rd = new Random();
        return salary = rd.nextInt(1000000, 9000000);
    }

    public void CommentSalary() {
        if (salary <= 4000000) {
            System.out.println("Low Salary");
        } else if (salary > 4000000 && salary <= 7000000) {
            System.out.println("Normal Salary");
        } else {
            System.out.println("High Salary");
        }

    }

    @Override
    public String toString() {

        DecimalFormat vndFormat = new DecimalFormat("#,### VND");
        String resultSalary = vndFormat.format(salary);

        return "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + resultSalary;
    }
}
