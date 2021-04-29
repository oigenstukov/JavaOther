package org.example;

import java.util.Scanner;

/**
 * Составить алгоритм: если введенное число больше 7, то вывести “Привет”
 */
public class App01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 7) {
            System.out.println("Hello!");
        }
    }
}
