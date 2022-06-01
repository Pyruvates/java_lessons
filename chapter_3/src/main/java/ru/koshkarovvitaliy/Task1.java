package ru.koshkarovvitaliy;

public class Task1 {
    public static void main(String[] args) {
        int sizeFirst = 20;
        int sizeSecond = 10;
        int repeat = 1;
        while (sizeFirst >= 1) {
            String treugolnik = "*".repeat(sizeFirst);
            System.out.println(treugolnik);
            --sizeFirst;
        }
        while (sizeSecond > repeat) {
            String treugolnik = "*".repeat(sizeSecond - (sizeSecond - repeat));
            System.out.println(treugolnik);
            ++repeat;
        }
    }
}
