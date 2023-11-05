package org.example.day5Abtract.HomeWork5.Ex3;

import java.util.Scanner;

public class Dev extends Staff {
    @Override
    public Staff newStaff() {
        Scanner sc = new Scanner(System.in);
        Dev dev = new Dev();

        System.out.println("Name : ");
        dev.setName(sc.nextLine());
        System.out.println("Age : ");
        dev.setAge(sc.nextInt());
        dev.setJobTitle(JOB.Dev);

        System.out.println(dev.toString());
        return dev;
    }
}
