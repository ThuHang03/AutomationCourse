package org.example.day2;

import java.util.Scanner;

public class JavaBasicDay2 {
    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap vao do dai mang : ");
        int[] arr = new int[sc.nextInt()];

        for (int num : arr
        ) {
            System.out.println("nhap gia tri : ");
            num = sc.nextInt();
            result += num;
        }

        System.out.printf("Ket qua : " + result);
    }
}
