package org.example.day5Abtract.HomeWork5.Ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StaffApplication {

    public static void main(String[] args) {
        List<Staff> listStaff = new ArrayList<>();

        chooseMainMenu(listStaff);
    }

    public static void mainMenu() {
        System.out.println("---------------------------");
        System.out.println("Choose : ");
        System.out.println("1. Add new DEV");
        System.out.println("2. Add new Test");
        System.out.println("3. Watch all staff");
        System.out.println("4.Exit");
        System.out.println("---------------------------");

    }

    public static void chooseMainMenu(List<Staff> listStaff) {
        Scanner sc = new Scanner(System.in);

        mainMenu();
        int choose = sc.nextInt();

        switch (choose) {
            case 1:
                Dev dev = new Dev();
                listStaff.add(dev.newStaff());
                System.out.println("Success");
                chooseMainMenu(listStaff);
                break;
            case 2:
                Tester tester = new Tester();
                listStaff.add(tester.newStaff());
                System.out.println("Success");
                chooseMainMenu(listStaff);
                break;

            case 3:
                Staff.getAllStaff(listStaff);
                chooseMainMenu(listStaff);
                break;
            case 4:
                System.out.println("Thank you");
                return;

            default:
                System.out.println("Error");
                chooseMainMenu(listStaff);
                break;
        }
    }
}
