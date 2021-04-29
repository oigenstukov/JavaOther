package org.example;

import java.util.Scanner;

/**
 * Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет,
 * то вывести "Нет такого имени"
 */
public class App02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.equals("Vyacheslav")) {
            System.out.println("Hello, " + s);
        } else {
            System.out.println("No such name.");
        }
    }
}
