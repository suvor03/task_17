package ru.vsu.cs.suvorov_d_a;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = scan.nextInt();

        int [] data = inputIntArray(size);
        System.out.println(Arrays.toString(data));

        String[] fixed = inputBooleanArray(size);
        System.out.println(Arrays.toString(fixed));

        MyBubbleSorting.sort(data, fixed);
    }

    private static int[] inputIntArray(int size) {
        Scanner scan = new Scanner(System.in);

        int[] array = new int[size];
        System.out.println("Insert array elements:");

        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }

        return array;
    }

    private static String[] inputBooleanArray(int size) {
        Scanner scan = new Scanner(System.in);

        String[] arr = new String[size];
        System.out.println("Insert array elements(True or False):");

        for (int i = 0; i < size; i++) {
            arr[i] = scan.next();
        }

        return arr;
    }
}
