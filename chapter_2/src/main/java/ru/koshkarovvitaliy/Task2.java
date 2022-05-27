package ru.koshkarovvitaliy;
import java.util.Scanner;
public class Task2 {
        Scanner scanner = new Scanner(System.in);
        public int summa () {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            return a + b;
        }
        public int raznost () {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            return a - b;
        }
        public int proizvedenie () {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            return a * b;
        }
        public int chastnoe () {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            return a / b;
        }
        public int stepen () {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            return (int) Math.pow(a, b);
        }
    }
