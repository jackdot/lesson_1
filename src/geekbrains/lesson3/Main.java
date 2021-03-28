package geekbrains.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        randomNumberGues ();
    }

    public static void randomNumberGues() {

        int maxTryCount = 4;
        //int tryCount = 0;

        Scanner sc = new Scanner (System.in);


        System.out.println ("Введите число от 0 до 9. ");

        gamePrecess (maxTryCount, sc);

    }

    private static void toRetry(int maxTryCount, int tryCount, Scanner sc, int randomNumber) {
        int userAnswer = sc.nextInt ();
        while (userAnswer == 1) {
            if ( tryCount > maxTryCount ) {
                gamePrecess (maxTryCount, sc);
                System.out.println ("Вы проиграли!! Правильный ответ был = " + randomNumber + "\nПовторить игру еще раз? 1 – да / 0 – нет");
                userAnswer = sc.nextInt ();

            } else
                System.out.println ("Правильный ответ был = " + randomNumber);
            if ( userAnswer == 1 ) {
                System.out.println ("Замечательно. Начинаем игру заново. \nВведите число от 0 до 9");
                gamePrecess (maxTryCount, sc);
            } else {
                System.out.println ("Всего доброго!");
            }
        }
    }


    private static int gamePrecess(int maxTryCount, Scanner sc) {
        int tryCount;
        Random random = new Random ();
        int randomNumber = random.nextInt (10);
        for (tryCount = 1; tryCount <= maxTryCount; tryCount++) {

            int userNumber = sc.nextInt ();

            if ( userNumber == randomNumber ) {
                System.out.println ("Вы угадали! Поздравляем. Игра окончена. \nПовторить игру еще раз? 1 – да / 0 – нет");
                toRetry (maxTryCount, tryCount, sc, randomNumber);

            } else if ( userNumber > randomNumber ) {
                System.out.println ("Вы ввели слишком большое число!");

            } else if ( userNumber < randomNumber ) {
                System.out.println ("Вы ввели слишком маленькое число!");

            }
            System.out.println ("\n Количество попыток осталось: " + (maxTryCount - tryCount));

        }
        System.out.println ("Вы проиграли!! Правильный ответ был = " + randomNumber + "\nПовторить игру еще раз? 1 – да / 0 – нет");
        toRetry (maxTryCount, tryCount, sc, randomNumber);

        return tryCount;
    }
}






