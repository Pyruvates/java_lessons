package ru.koshkarovvitaliy;

import java.util.Scanner;

/*
    Написать программу, которая считывает с консоли целое число,
    сравнивает его с нулём и выводит результат сравнения в консоль
 */

public class ZeroComparator {
    public static void main(String[] args) {
        System.out.println("Start");
        int number;

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Enter any number");

            if (scanner.hasNext()) {
                number = scanner.nextInt(10);
            }
//            Раскомментировать if и написать свой код тут
//            if (number) {
//            }

            System.out.println("End");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
