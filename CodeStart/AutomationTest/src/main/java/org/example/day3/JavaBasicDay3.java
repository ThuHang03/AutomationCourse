package org.example.day3;

import java.util.Arrays;

public class JavaBasicDay3 {
    public static void main(String[] args) {
        BubbleSort(new int[]{2, 7, 9, 4, 1, 6});
    }

    public static void BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void InHetCho5() {
        System.out.println("Cac so chia het cho 5 : ");
        for (int i = 100; i > 0; i -= 5) {
            if (i % 5 == 0)
                System.out.print(i + " ");
        }
    }

    public static int TimSoLonNhat(int a, int b) {
        return Math.max(a, b);
    }

    public static String TimSoChanLet(double a) {
        return a % 2 == 0 ? "so chan " : "so le";
    }
}
