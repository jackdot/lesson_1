package geekbrains.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String args[]){

        randomNumberGues();

    }

    public static void randomNumberGues(){

        int maxTryCount = 4;

        Scanner sc = new Scanner(System.in);
        Random random = new Random();


        System.out.println("Введите число от 0 до 9. ");

        for (int tryCount = 1 ;tryCount <= maxTryCount; tryCount++){

            int userNumber = sc.nextInt();
            int randomNumber = random.nextInt(10);

            if (userNumber == randomNumber) {
                System.out.println("Вы угадали! Поздравляем. Игра окончена. ");
                break;

            } else if (userNumber > randomNumber) {
                System.out.println("Вы ввели слишком большое число!");
                
            } else if (userNumber < randomNumber) {
                System.out.println("Вы ввели слишком маленькое число!");
            }

            System.out.println("Попробуйте ещё раз. Введите число от 0 до 9\n Количество попыток осталось: " + (maxTryCount - tryCount));

            if (tryCount > maxTryCount)
                System.out.println("Вы проиграли!!");
            else
                System.out.println("Правильный ответ был = " + randomNumber);
        }
    }
}
