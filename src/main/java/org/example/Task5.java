package org.example;

import java.util.Scanner;
import java.util.SortedMap;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int monthNumber = scanner.nextInt();
            if (monthNumber < 13) {
        switch (monthNumber) {
                case 1:
                case 2:
                case 12:
                    System.out.println("Это зимний месяц");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Это весенний месяц");
                case 6:
                case 7:
                case 8:
                    System.out.println("Это летний месяц");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Это осенний месяц");
                    break;
            }
        }
    }
}
