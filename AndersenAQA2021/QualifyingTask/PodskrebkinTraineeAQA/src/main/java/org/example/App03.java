package org.example;

import java.util.Arrays;

/**
 * Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
 */
public class App03 {
    public static void main(String[] args) {
        int[] arr = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();
        for (int a : arr) {
            if (a % 3 == 0) {
                System.out.print(a + " ");
            }
        }
    }
}
