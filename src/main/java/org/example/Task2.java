package org.example;

public class Task2 {
    public static void main(String[] args) {
        int clientOS = 1;
        int clientDeviceYear = 2016;
        if (clientOS == 0) {
            if (clientDeviceYear > 2015) {
                System.out.println("Установите версию приложения для IOS");
            } else {
                System.out.println("Установите облегченную верчию приложения для IOS");
            }
        }
            if (clientDeviceYear > 2015) {
                System.out.println("Установите версию приложения для Android");
            } else {
                System.out.println("Установите облегченную верчию приложения для Android");
            }
        }
    }

