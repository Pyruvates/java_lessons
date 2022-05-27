package ru.koshkarovvitaliy;
public class Task5 {
    public static void main(String[] args) {
        int inputNumber = 998;
        int numberBeforeInputNumber = inputNumber - 1;
        while (numberBeforeInputNumber > 1) {
           if ((numberBeforeInputNumber % 2 == 0 || numberBeforeInputNumber % 3 == 0 || numberBeforeInputNumber % 5 == 0 || numberBeforeInputNumber % 7 == 0) && (numberBeforeInputNumber != 2 && numberBeforeInputNumber != 3 && numberBeforeInputNumber != 5 && numberBeforeInputNumber != 7 )) {
               System.out.println(numberBeforeInputNumber + " - Sostavnoe");
           }
           else {
               System.out.println(numberBeforeInputNumber);
           }
           --numberBeforeInputNumber;
        }
    }
}
