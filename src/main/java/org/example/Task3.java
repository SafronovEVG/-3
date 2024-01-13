package org.example;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год");
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.println("Год високосный");
            } else {
                System.out.println("Год не високосный");
            }
        } else {
            System.out.println("Год не високосный");
        }
    }
}
