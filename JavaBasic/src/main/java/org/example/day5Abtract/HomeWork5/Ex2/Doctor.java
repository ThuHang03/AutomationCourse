package org.example.day5Abtract.HomeWork5.Ex2;

import java.util.Scanner;

public class Doctor {
    public static void main(String[] args) {
        SalaryCalculate doctor1 = new SalaryCalculate();
        doctor1.name = "doctor1";
        Scanner sc = new Scanner(System.in);
        System.out.println("Type 1 or 2 : ");
        switch (sc.nextInt()) {
            case 1:
                System.out.println(doctor1.name + " : " + doctor1.sumSalary(500, 3, 1, 0.2));
                return;

            case 2:
                System.out.println(doctor1.name + " : " + doctor1.sumSalary(500, 3, 1, 0.45));
                return;
        }
    }
}
