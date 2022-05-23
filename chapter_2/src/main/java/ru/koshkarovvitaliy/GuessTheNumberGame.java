package ru.koshkarovvitaliy;

import java.util.Random;
import java.util.Scanner;

/*
    Написать игру, в которой предлагается угадать число от 1 до 10.
    Игрок вводит целое число, а программа сравнивает его и выводит результат сравнения в консоль.
    Игроку даётся 3 попытки. В случае угадывания в консоль выводится 'Верно!', в случае неудачной попытки подсказка -
    'Больше' или 'Меньше' и предлагается угадать ещё раз. В случае если игрок провалил все 3 попытки, игра заканчивается
    и в консоль должно быть выведено загаданное число.
 */

public class GuessTheNumberGame {
    public static void main(String[] args) {
        System.out.println("Start");
        String guessStr = "Guess the number from 1 to 10";
        int num = new Random().nextInt(1, 11);
        int inputNumber = 0;
        int tryNumber = 1;
        System.out.println(guessStr);

        try (Scanner scanner = new Scanner(System.in)) {

            if (scanner.hasNext()) {
                inputNumber = scanner.nextInt(10);
            }
            while (tryNumber <= 3) {
                if (num == inputNumber) {
                    System.out.println("Verno!");
                    break;
                }
                if (num > inputNumber) {
                    System.out.println("Bolshe");
                    inputNumber = scanner.nextInt(10);
                } else {
                    System.out.println("Menshe");
                    inputNumber = scanner.nextInt(10);
                }
                ++tryNumber;
                if (tryNumber == 3 && inputNumber != num) {
                    System.out.println(num);
                    break;
                }

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
