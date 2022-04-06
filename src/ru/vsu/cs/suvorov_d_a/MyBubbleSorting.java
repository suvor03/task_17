package ru.vsu.cs.suvorov_d_a;

import java.util.Arrays;
import java.util.Objects;

public class MyBubbleSorting {
    public static <T extends Comparable<T>> void sort(int[] data, String[] fixed) {

        for (int i = 0; i < data.length - 1; i++) {
            if (Objects.equals(fixed[i], "true")) {
                for (int j = i + 1; j < data.length; j++) {
                    if ((Objects.equals(fixed[j], "true")) && (data[i] > data[j])) {
                        int temp = data[i];
                        data[i] = data[j];
                        data[j] = temp;
                    }
                }
            }
        }
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(data));
    }
}