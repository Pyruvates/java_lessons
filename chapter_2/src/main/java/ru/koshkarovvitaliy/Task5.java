package ru.koshkarovvitaliy;
public class Task5 {
    public static void main(String[] args) {
    }
        int inputNumber = 50;
        public void primeNumbers (int inputNumber) {
            while (inputNumber > 1) {
                if (inputNumber % 2 != 0 && inputNumber % 3 != 0 && inputNumber % 5 != 0 && inputNumber % 7 != 0) {
                    System.out.println(inputNumber);
                }
                --inputNumber;
            }
        }
}





