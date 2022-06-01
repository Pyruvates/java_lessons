package ru.koshkarovvitaliy;
public class Task5 {
    int inputNumber = 50;
    public static void main(String[] args) {
    }
        public void primeNumbers (int inputNumber) {
            while (inputNumber > 1) {
                if (inputNumber % 2 != 0 && inputNumber % 3 != 0 && inputNumber % 5 != 0 && inputNumber % 7 != 0) {
                    System.out.println(inputNumber);
                }
                --inputNumber;
            }
        }
}





