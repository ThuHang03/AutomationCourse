package org.example.day5Abtract.HomeWork5.Ex3;

import java.util.Scanner;

public class Tester extends Staff {
    @Override
    public Staff newStaff() {
        Scanner sc = new Scanner(System.in);
        Tester tester = new Tester();
        System.out.println("Name : ");
        tester.setName(sc.nextLine());
        System.out.println("Age : ");
        tester.setAge(sc.nextInt());
        tester.setJobTitle(JOB.Tester);
        System.out.println(tester.toString());

        return tester;
    }
}
