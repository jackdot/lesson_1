package geekbrains.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static final int MAX_TRY_COUNT = 4;

    public static void main(String[] args) {

        //guessNumber();
        wordsGame();
    }



    public static void guessNumber(){
        Scanner sc = new Scanner (System.in);
        System.out.println ("Введите число от 0 до 9. ");
        gamePrecess (MAX_TRY_COUNT, sc);
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


    private static int gamePrecess(int MAX_TRY_COUNT, Scanner sc) {
        int tryCount;
        Random random = new Random ();
        int randomNumber = random.nextInt (10);
        for (tryCount = 1; tryCount <= MAX_TRY_COUNT; tryCount++) {

            int userNumber = sc.nextInt ();

            if ( userNumber == randomNumber ) {
                System.out.println ("Вы угадали! Поздравляем. Игра окончена. \nПовторить игру еще раз? 1 – да / 0 – нет");
                toRetry (MAX_TRY_COUNT, tryCount, sc, randomNumber);

            } else if ( userNumber > randomNumber ) {
                System.out.println ("Вы ввели слишком большое число!");

            } else if ( userNumber < randomNumber ) {
                System.out.println ("Вы ввели слишком маленькое число!");

            }
            System.out.println ("\n Количество попыток осталось: " + (MAX_TRY_COUNT - tryCount));

        }
        System.out.println ("Вы проиграли!! Правильный ответ был = " + randomNumber + "\nПовторить игру еще раз? 1 – да / 0 – нет");
        toRetry (MAX_TRY_COUNT, tryCount, sc, randomNumber);

        return tryCount;

    }
    //При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с загаданным словом и сообщает,
    // правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
    //apple – загаданное
    //apricot - ответ игрока

    private static void wordsGame() {
        //String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String[] words = {"apple", "orange"};
        Scanner sc = new Scanner (System.in);

        System.out.println ("Угадайте слово!");

        String userAnswer = sc.nextLine ();

        if(userAnswer == words[0]){
            System.out.println ("Конгратуляции, вы угадали!");
        } else{
            System.out.println ("вы не угадали!");
        }




    }
}







