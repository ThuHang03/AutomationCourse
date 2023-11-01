package org.example.day3;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkDay3 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 4, 7, 6, 1, 6};
        System.out.println(Arrays.toString(arr));
    }

    public static void Swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    Swap(arr, arr[j], arr[j + 1]);
                }
            }
        }
        System.out.println("Sap xep giam dan : " + Arrays.toString(arr));
    }

    public static void BaiToan2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do dai chuoi : ");
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhap vao phan tu thu " + i);
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0 && arr[i] % 3 == 0) {
                System.out.println("Dieu kien thoat xay ra");
                return;
            }
        }
        System.out.println("khong co phan tu nao chia het cho 2 va 3");
        BubbleSort(arr);
    }
}
