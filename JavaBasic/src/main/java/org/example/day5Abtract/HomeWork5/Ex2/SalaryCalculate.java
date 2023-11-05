package org.example.day5Abtract.HomeWork5.Ex2;

public class SalaryCalculate {
    public String name;

    public double sumSalary(double basicSalary, double number) {
        return basicSalary * number;
    }

    public double sumSalary(double basicSalary, int number, double yearExpensive) {
        return basicSalary * number * yearExpensive;
    }

    public double sumSalary(double basicSalary, int number, double yearExpensive, double type) {
        return basicSalary * number * yearExpensive * type;
    }

}
