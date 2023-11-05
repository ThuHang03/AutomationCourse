package org.example.day5Abtract.Overloading;

import java.util.Scanner;

public class Salary {
    public String name;

    public double sumSalary(double basicSalary, double salaryNumber) {
        return basicSalary * salaryNumber;
    }

    public double sumSalary(double basicSalary, int salaryNumber, double yearExpensive) {
        return basicSalary * salaryNumber * yearExpensive;
    }

    public double sumSalary(double basicSalary, int salaryNumber, double yearExpensive, double type) {
        return basicSalary * salaryNumber * yearExpensive * type;
    }

    public static void main(String[] args) {
        Salary staff1 = new Salary();
        staff1.name = "Staff 1";
        Scanner sc = new Scanner(System.in);
        System.out.println("Type 1 or 2 : ");
        switch (sc.nextInt()) {
            case 1:
                System.out.println(staff1.name + " : " + staff1.sumSalary(500, 3, 1, 0.2));
                return;

            case 2:
                System.out.println(staff1.name + " : " + staff1.sumSalary(500, 3, 1, 0.45));
                return;
        }

        Salary staff2 = new Salary();
        staff2.name = "Staff 2";
        System.out.println(staff2.name + " : " + staff2.sumSalary(500, 4));
    }
}
